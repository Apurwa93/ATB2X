package Practice_1st_April.Inner_class_demo;

public class Car {
    String make;

    //parameterize constructor
    public Car(String make){
        this.make = make;
    }
    //Method
    void drive(){
        System.out.println("You can drive car");
    }

    //Inner class
    public class Engine{

        //Instance variable
        String hoursepower;

        //parameterize constructor
        public Engine(String hoursepower){
            this.hoursepower = hoursepower;
        }

        //Method

        void Start(){
            System.out.println("Engine is Started-->" +make);
        }

    }
}
