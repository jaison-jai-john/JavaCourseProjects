package JavaCourseProjects;

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
      // Determine the main class name based on the folder name
      String mainClassName = projectPath.getFileName().toString();

      // Determine the command to run based on the operating system
      String os = System.getProperty("os.name").toLowerCase();
      ProcessBuilder runBuilder;
      if (os.contains("win")) {
        // Windows
        String command = String.format("cmd /c start cmd /k \"java %s\\%s.java\"", projectPath, mainClassName);
        runBuilder = new ProcessBuilder("cmd", "/c", command);
      } else if (os.contains("mac")) {
        // macOS
        String command = String.format("java %s/%s.java", projectPath, mainClassName);
        runBuilder = new ProcessBuilder("sh", "-c", "open -a Terminal.app '" + command + "'");
      } else {
        // Linux and other Unix-like systems
        String command = String.format("java %s/%s.java", projectPath, mainClassName);
        runBuilder = new ProcessBuilder("sh", "-c", "x-terminal-emulator -e '" + command + "'");
      }

      runBuilder.directory(Paths.get(".").toFile()); // Set the working directory to the current working directory
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