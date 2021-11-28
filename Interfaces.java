import java.io.*;

interface Vehicle {
    
    void IncSpeed(int a);
    void DecSpeed(int a);

}

class Bicycle implements Vehicle{

    int speed;

    // to increase speed
    @Override
    public void IncSpeed(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void DecSpeed(int decrement){

        speed = speed - decrement;
    }


    public void printStates() {
        System.out.println("speed: " + speed);
    }
}

class Bike implements Vehicle {

    int speed;
    // to increase speed
    @Override
    public void IncSpeed(int increment){

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void DecSpeed(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed);
    }

}
class Main {

    public static void main (String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.IncSpeed(10);
        bicycle.DecSpeed(2);


        System.out.println("Present state of bicycle  :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.IncSpeed(20);
        bike.DecSpeed(5);


        System.out.println("Present state of Bike  :");
        bike.printStates();
    }
}

