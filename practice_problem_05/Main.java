package practice_problem_05;

public class Main {
    public static void main(String[] args){

        System.out.println("Car Object Demonstration: \n");
        Car car = new Car(
                "Saikat Hossain", "Mercedes-Benz",
                "407-02-2003A", "Black", 45.00
        );

        car.checkFuel();
        car.start();
        car.accelerator();
        car.stop();

        System.out.println("\nDog Object Demonstration: \n");
        Dog dog = new Dog("Ghost", 5, "Siberian Husky");

        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Breed: " + dog.getBreed() + "\n");

        dog.bark();
        dog.run();
        dog.spin();

        System.out.println("\nLibrary System Demonstration: \n");

        LibrarySystem book1 = new LibrarySystem("The Alchemist");
        book1.getInfo();

        LibrarySystem book2 = new LibrarySystem("Deyal", "Humayum Ahmed");
        book2.getInfo();


    }
}
