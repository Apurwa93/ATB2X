package Practice_19march.Inheritence;

public class Programming {

    int version;
    String author;
    Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printinformation(){
        System.out.println("This programming Language is created by " + author + " Had version " + version);

    }
}
