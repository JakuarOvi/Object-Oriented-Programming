/*
Task 8 - Quiz Application:
Create a quiz application with different question types like MultipleChoice,
TrueFalse that inherit from a common Question class.
Encapsulate attributes in the base class: question and difficultyLevel.
Implement polymorphism with the following methods:
scoreQuestion(): Score the question based on the user's response.
displayQuestion(): Display the question and difficulty level.
*/

package ovi.task8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Question {
    protected String question;
    protected String difficultyLevel;

    // Constructor to initialize the question and difficulty level
    public Question(String question, String difficultyLevel) {
        this.question = question;
        this.difficultyLevel = difficultyLevel;
    }

    // Abstract methods for polymorphism
    public abstract void scoreQuestion(String answer);
    public abstract void displayQuestion();

    // Getter methods
    public String getQuestion() {
        return question;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }
}

class MultipleChoice extends Question {
    private List<String> options;
    private String correctAnswer;

    // Constructor for MultipleChoice question
    public MultipleChoice(String question, String difficultyLevel, List<String> options, String correctAnswer) {
        super(question, difficultyLevel);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Override displayQuestion to show the multiple choice options
    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestion() + " (Difficulty: " + getDifficultyLevel() + ")");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Override scoreQuestion to score based on the user's answer
    @Override
    public void scoreQuestion(String answer) {
        if (answer.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Incorrect Answer.");
        }
    }
}

class TrueFalse extends Question {
    private boolean correctAnswer;

    // Constructor for TrueFalse question
    public TrueFalse(String question, String difficultyLevel, boolean correctAnswer) {
        super(question, difficultyLevel);
        this.correctAnswer = correctAnswer;
    }

    // Override displayQuestion for True/False question
    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestion() + " (Difficulty: " + getDifficultyLevel() + ")");
        System.out.println("1. True");
        System.out.println("2. False");
    }

    // Override scoreQuestion to score based on the user's answer
    @Override
    public void scoreQuestion(String answer) {
        boolean userAnswer = answer.equalsIgnoreCase("True");
        if (userAnswer == correctAnswer) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Incorrect Answer.");
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        // Create questions
        List<String> options1 = new ArrayList<>();
        options1.add("Apple");
        options1.add("Banana");
        options1.add("Cherry");
        options1.add("Date");

        Question q1 = new MultipleChoice("What is the best fruit?", "Easy", options1, "Apple");

        Question q2 = new TrueFalse("The Earth is flat.", "Hard", false);

        // Store questions in a list
        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Iterate through questions and ask user
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            q.scoreQuestion(answer);
        }

        scanner.close();
    }
}
