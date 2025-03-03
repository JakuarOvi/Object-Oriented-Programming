/*
Task 1: Create a class called "Song" with final attributes "title" and "artist"
that cannot be modified after initialization. Add a static counter "playCount"
that tracks how many songs have been played across the application.
Implement a method "play()" that increments this counter whenever any
song is played. Create a simple program that instantiates several songs
and plays them, then displays the total play count.

Sample Output:
Playing "Bohemian Rhapsody" by Queen...
Playing "Shape of You" by Ed Sheeran...
Playing "Bohemian Rhapsody" by Queen...

Total songs played: 3
*/
package task1;
 class Task1 {
     static int playCount = 0;
     final String title;
     final String artist;

    public Task1(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void play() {
        playCount++;
        System.out.println("Playing \"" + getTitle() + "\" by " + getArtist() + "...");
    }

    public static int getPlayCount() {
        return playCount;
    }

    public static void main(String[] args) {
        Task1 song1 = new Task1("Bohemian Rhapsody", "Queen");
        Task1 song2 = new Task1("Shape of You", "Ed Sheeran");
        Task1 song3 = new Task1("Bohemian Rhapsody", "Queen");

        song1.play();
        song2.play();
        song3.play();

        System.out.println("\nTotal songs played: " + getPlayCount());
    }
}
