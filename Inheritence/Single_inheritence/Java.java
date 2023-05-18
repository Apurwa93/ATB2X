package Practice_19march.Inheritence;

public class Java extends Programming {
    String newFeature;
    int version;
    String author;


    Java(int version, String author, String newFeature){
        super(version, author);
        this.newFeature = newFeature;
    }
    void printDetails(){
        super.printinformation();
        System.out.println("New feature is: " +newFeature);
    }
}
