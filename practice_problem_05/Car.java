package practice_problem_05;

public class Car {

    public String owner;
    public String name;
    public String serial;
    public String color;
    private double fuelLevel;

    Car(String owner, String name, String serial, String color, double fuelLevel){
        this.owner = owner;
        this.name = name;
        this.serial = serial;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public void start(){
        System.out.println(name + " is starting.");
    }
    public void stop(){
        System.out.println(name + " is stopping.");
    }
    public void checkFuel(){
        System.out.println("Fuel Level: " + fuelLevel + " L");
    }
    public void accelerator(){
        System.out.println("The car is accelerating");
    }

}
