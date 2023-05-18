package Practice_25March.Multilevel_inheritence;

public class Vehicle {

    int seats;
    String engineType;
    int speed;

    Vehicle(int speed){
        this.speed = speed;
    }
    void VehicleHastostop(){

        System.out.println("Yeah from "+getClass().getSimpleName());


    }

}
