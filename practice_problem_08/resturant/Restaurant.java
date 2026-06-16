package practice_problem_08.resturant;

public abstract class Restaurant {
    double price;
    double tax = (double) 10/100;
    int time = 40;

//    void calculateTotalBill() {
//        System.out.println("Your total bill is: " + price * tax +" Tk.");
//    }
    abstract void calculateTotalBill();

    void estimateDeliveryTime(){
        System.out.println("Estimated Delivery Time: " + time +" min");
    }

}
