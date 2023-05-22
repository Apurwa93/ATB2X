package Practice_26March.Abstract;

public class Dog extends Animal{
    public static void main(String[] args) {

    }

    @Override
    void say() {
        System.out.println(getClass().getSimpleName()+ " Bow Bow");

    }

}
