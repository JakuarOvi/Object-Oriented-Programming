
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
