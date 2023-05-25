package Practice_1st_April.Inner_class_demo;

public class Runner_class {

    public static void main(String[] args) {

        Car c = new Car("Lambo");
        Car.Engine engine = c.new Engine("400");

        engine.Start();
        c.drive();

    }
}
