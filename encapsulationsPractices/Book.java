package Practice_19march.encapsulationsPractices;

public class Book {
    private String title;
    private int noofcopies;

    public String getTitle() {
        return title;
    }

    public void setOfgffbfvfvfvofvfTitle(String title) {
        this.title = title;
    }
    public int getNoofcopies() {
        return noofcopies;
    }
    public void setNoofcopies(int noofcopies) {
        if(noofcopies>0){
            this.noofcopies = noofcopies;
        }else {
            System.out.println("Hacker Go away");
        }
        this.noofcopies = noofcopies;

    }
}
