package Practice_19march;

public class Student {
    //Data variable
    String name;
    String coursename;
    long phonenumber;
    int age;
    String emailid;

    Student(){
        System.out.println("I am called");
    }
    //parameterize constructor
    Student(String name1){
        this.name = name1;
        System.out.println("I am called with the name-->"+this.name);
        System.out.println("I am called with the name-->"+name1);
    }

    void eat(){
        System.out.println("I am eating");
    }
    void walk(){
        System.out.println("I am walking");
    }
    boolean isMale(){
        return true;
    }

}
