package Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProjectFinder {
  public static List<Path> findProjects(Path rootDir) throws IOException {
    List<Path> projectPaths = new ArrayList<>();
    Files.walk(rootDir)
        .filter(Files::isDirectory)
        .forEach(path -> {
          try {
            System.out.println("Checking directory: " + path);
            if (Files.list(path).anyMatch(p -> p.toString().endsWith(".java"))) {
              projectPaths.add(path);
              System.out.println("Java project found: " + path);
            }
          } catch (IOException e) {
            System.err.println("Error reading directory: " + path);
            e.printStackTrace();
          }
        });
    return projectPaths;
  }
}