package Practice_25March.Multilevel_inheritence;

public class Tesla extends Car {

    Tesla(int i){
        super(i);
    }


    public void topSpeed() {
        System.out.println("Yo I am an Tesla");
    }
}
