
package task5;

abstract class Movie {
    final String title;
    final String director;

    static int totalMovies = 0;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        totalMovies++;
    }

    public static int getMovieCount() {
        return totalMovies;
    }

    public abstract double calculateRating();
    public abstract void displayInfo();
}

class ActionMovie extends Movie {
    final String stuntsCoordinator;

    static int dangerLevel = 9;

    public ActionMovie(String title, String director, String stuntsCoordinator) {
        super(title, director);
        this.stuntsCoordinator = stuntsCoordinator;
    }

    @Override
    public double calculateRating() {
        return 8.5; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Action Movie: \"" + title + "\" directed by " + director + ".");
        System.out.println("Stunt Coordinator: " + stuntsCoordinator);
        System.out.println("Danger Level: " + dangerLevel + "/10");
        System.out.println("Calculated Rating: " + calculateRating() + "/10");
    }
}

class ComedyMovie extends Movie {
    final String humorStyle;

    public ComedyMovie(String title, String director, String humorStyle) {
        super(title, director);
        this.humorStyle = humorStyle;
    }

    public static double getLaughterRating() {
        return 7.8; 
    }

    @Override
    public double calculateRating() {
        return 7.5; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Comedy Movie: \"" + title + "\" directed by " + director + ".");
        System.out.println("Humor Style: " + humorStyle);
        System.out.println("Laughter Rating: " + getLaughterRating() + "/10");
        System.out.println("Calculated Rating: " + calculateRating() + "/10");
    }
}

public class Task5 {
    public static void main(String[] args) {
        ActionMovie actionMovie = new ActionMovie("Mad Max: Fury Road", "George Miller", "Tom Hardy");
        ComedyMovie comedyMovie = new ComedyMovie("Superbad", "Greg Mottola", "Teen Comedy");

        actionMovie.displayInfo();
        comedyMovie.displayInfo();

        System.out.println("\nTotal movies created: " + Movie.getMovieCount());
    }
}
