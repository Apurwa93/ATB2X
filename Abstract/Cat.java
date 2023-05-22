package Practice_26March.Abstract;

public  class Cat extends Animal{


    @Override
    void say() {
        System.out.println(getClass().getSimpleName()+ " meow meow");

    }

}
