package Lab;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ProjectRunnerGUI extends JFrame {
  private JList<String> projectList;
  private JTextArea outputArea;
  private JButton runButton;
  private List<Path> projects;

  public ProjectRunnerGUI(List<Path> projects) {
    this.projects = projects;
    setTitle("Java Project Runner");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    List<String> projectNames = projects.stream()
        .map(path -> path.getFileName().toString())
        .collect(Collectors.toList());

    projectList = new JList<>(projectNames.toArray(new String[0]));
    JScrollPane listScrollPane = new JScrollPane(projectList);

    outputArea = new JTextArea();
    outputArea.setEditable(false);
    JScrollPane outputScrollPane = new JScrollPane(outputArea);

    runButton = new JButton("Run");
    runButton.addActionListener(new RunButtonListener());

    add(listScrollPane, BorderLayout.WEST);
    add(outputScrollPane, BorderLayout.CENTER);
    add(runButton, BorderLayout.SOUTH);
  }

  private class RunButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      int selectedIndex = projectList.getSelectedIndex();
      if (selectedIndex != -1) {
        Path selectedProject = projects.get(selectedIndex);
        runProject(selectedProject);
      }
    }
  }

  private void runProject(Path projectPath) {
    try {
      // Compile the Java files in the project directory
      // ProcessBuilder compileBuilder = new ProcessBuilder("javac", "*.java");
      // compileBuilder.directory(projectPath.toFile()); // Set the working directory
      // to the project directory
      // Process compileProcess = compileBuilder.start();
      // compileProcess.waitFor();

      // Determine the main class name based on the folder name
      String mainClassName = projectPath.getFileName().toString();

      // Run the main class with the fully qualified name in a new command prompt
      // window
      String command = String.format("cmd /c start cmd /k \"java %s\\%s.java\"", projectPath, mainClassName);
      System.out.println(projectPath);
      ProcessBuilder runBuilder = new ProcessBuilder("cmd", "/c", command);
      runBuilder.directory(Paths.get(".").toFile()); // Set the working directory to the project directory
      runBuilder.start();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    try {
      Path rootDir = Paths.get("."); // Use the current working directory
      List<Path> projects = ProjectFinder.findProjects(rootDir);
      SwingUtilities.invokeLater(() -> {
        ProjectRunnerGUI gui = new ProjectRunnerGUI(projects);
        gui.setVisible(true);
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}