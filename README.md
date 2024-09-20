# Java Programming Projects Repository

This repository contains all the projects and code completed for the **Programming in Java** course. The repository is organized such that each project is stored in a dedicated folder.

Additionally, a **Graphical User Interface (GUI)** is provided to help users browse through the repository, find projects, and run them directly from the GUI.

## Features of the GUI

- **Project Finder:** Automatically lists all the projects within the repository.
- **Run Projects:** Allows users to compile and run projects directly from the GUI.

## Prerequisites

Ensure you have the following set up before running the projects:

1. **Java JDK (version 8 or higher)** installed.

   - To check if Java is installed, run:

     ```bash
     java -version
     ```

2. **javac** (Java Compiler) available in your system's PATH.

## Setup Instructions

### 1. Clone the Repository

To clone the repository, run the following command:

```bash
git clone https://github.com/jaison-jai-john/JavaCourseProjects.git
cd JavaCourseProjects
```

### 2. Running the GUI

The GUI can be run on **Windows**, **macOS**, and **Linux**. Follow the platform-specific instructions to compile and run the GUI.

#### Windows

```bash
cd path\to\repository
javac -d . ProjectRunnerGUI.java ProjectFinder.java
java JavaCourseProjects/ProjectRunnerGUI
```

#### macOS/Linux

```bash
cd path/to/repository
javac -d . ProjectRunnerGUI.java ProjectFinder.java
java JavaCourseProjects/ProjectRunnerGUI
```

### 3. Running Individual Projects

If you'd prefer to run individual projects outside of the GUI, navigate to the project folder and use the following commands.

For example, to compile and run a project in `Lab1`:

```bash
javac Lab1/MyProject.java
java Lab1.MyProject
```

## Path Management and Platform Considerations

- **Windows:** The project is designed with Windows paths (using backslashes `\`) in mind. The code should work seamlessly in this environment.
- **macOS/Linux:** Since these platforms use forward slashes `/` for paths, the program should automatically detect the platform and adjust accordingly. However, this functionality has **not been tested** due to the lack of access to macOS/Linux machines.

**Note:** If you encounter any issues on macOS or Linux, please submit an issue to this repository, and contributions to improve cross-platform compatibility are welcome!

## Troubleshooting

- **Ensure Java is installed** on your system and that both `java` and `javac` commands are available in your terminal/command prompt.
- **macOS/Linux Users:** If the path adjustments are not working as expected, ensure you are using the correct case for filenames (since macOS and Linux file systems are case-sensitive).

## Contributing

If you'd like to contribute to this repository, feel free to fork it and submit a pull request. Contributions related to improving macOS and Linux compatibility are especially welcome!

## License

This project is licensed under the MIT License.
