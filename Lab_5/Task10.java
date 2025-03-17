/*
Task 10 - Movie Database:
Build a movie database with various movie genres like Action and
Comedy that inherit from a common Movie class.
Encapsulate attributes in the base class: title, director and releaseYear.
Implement polymorphism with the following methods:
displayMovieInfo(): Display the movie title, director, and release year.
*/

package ovi.task10;

abstract class Movie {
    protected String title;
    protected String director;
    protected int releaseYear;

    // Constructor to initialize the common attributes
    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    // Abstract method to display movie information
    public abstract void displayMovieInfo();
}
class Action extends Movie {

    public Action(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    // Implementing the method to display movie information for Action genre
    @Override
    public void displayMovieInfo() {
        System.out.println("Action Movie Info:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
    }
}
class Comedy extends Movie {

    public Comedy(String title, String director, int releaseYear) {
        super(title, director, releaseYear);
    }

    // Implementing the method to display movie information for Comedy genre
    @Override
    public void displayMovieInfo() {
        System.out.println("Comedy Movie Info:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
    }
}

public class Task10 {

     public static void main(String[] args) {
        // Create some Action and Comedy movies
        Movie actionMovie = new Action("Mad Max: Fury Road", "George Miller", 2015);
        Movie comedyMovie = new Comedy("The Hangover", "Todd Phillips", 2009);

        // Display movie info for Action movie
        actionMovie.displayMovieInfo();

        // Display movie info for Comedy movie
        comedyMovie.displayMovieInfo();
    }
}
