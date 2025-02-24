public class Manga {
    String title;
    int chapters;
    static int totalManga = 0;

    public Manga(String title, int chapters) {
        this.title = title;
        this.chapters = chapters;
        totalManga++;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Chapters: " + chapters);
    }

    public void readChapter() {
        System.out.println("Reading chapter...");
    }

    public static int getTotalManga() {
        return totalManga;
    }
}

public class ShonenManga extends Manga {
    String mainCharacter;

    public ShonenManga(String title, int chapters, String mainCharacter) {
        super(title, chapters);
        this.mainCharacter = mainCharacter;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Main Character: " + mainCharacter);
    }
}

public class IsekaiManga extends Manga {
    String isekaiPlace;

    public IsekaiManga(String title, int chapters, String isekaiPlace) {
        super(title, chapters);
        this.isekaiPlace = isekaiPlace;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Isekai Place: " + isekaiPlace);
    }
}

public class Main {
    public static void main(String[] args) {
        Manga manga1 = new Manga("One Piece", 1000);
        ShonenManga manga2 = new ShonenManga("Naruto", 700, "Naruto Uzumaki");
        IsekaiManga manga3 = new IsekaiManga("That Time I Got Reincarnated as a Slime", 100, "Tempest");

        manga1.displayDetails();
        manga2.displayDetails();
        manga3.displayDetails();

        System.out.println("Total Manga: " + Manga.getTotalManga());
    }
}
