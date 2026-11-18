# Object-Oriented Programming

A collection of Java exercises and lab assignments covering programming fundamentals and object-oriented programming concepts. The repository is organized by lab; most tasks are standalone programs, while some Lab 4 tasks are Maven projects.

## Repository structure

| Directory | Contents |
| --- | --- |
| `Lab_1/` | Introductory Java tasks, including loops and basic program flow |
| `Lab_2/` | Array-focused exercises, such as finding minimum and maximum values |
| `Lab_3/` | Object-oriented exercises, including classes, inheritance, and method overriding |
| `Lab_4/` | Task-based projects; some include their own `pom.xml` and Maven source tree |
| `Lab_5/` | Additional Java task exercises |
| `Lab_test1.java` | A standalone example modeling manga types with inheritance and overridden methods |

## Requirements

- A Java Development Kit (JDK)
- Maven for tasks that include a `pom.xml` (such as `Lab_4/Task1`)

## Compile and run a standalone task

Many source files declare a Java package, so compile with `-d` to place class files in the correct package directory. From the repository root, for example:

```bash
mkdir -p out
javac -d out Lab_1/Task1.java
java -cp out com.mycompany.task1.Task1
```

To run another task, replace `Lab_1/Task1.java` with its source path and use the fully qualified class name declared in that file. Tasks may read input from standard input; follow the prompts or task comments where applicable.

## Build a Maven task

Run Maven from the task directory that contains `pom.xml`:

```bash
cd Lab_4/Task1
mvn package
```

The labs are independent exercises, so there is no single repository-wide build command.
