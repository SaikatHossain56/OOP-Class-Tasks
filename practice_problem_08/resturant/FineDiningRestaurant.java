package practice_problem_08.resturant;

public class FineDiningRestaurant extends Restaurant{
    FineDiningRestaurant(double foodPrice){
        this.price = foodPrice;
    }

    @Override
    void calculateTotalBill() {
        System.out.println("Your total bill is: " + (price + (price * tax)) +" Tk.");
    }
    @Override
    void estimateDeliveryTime(){
        System.out.println("Estimated Delivery Time: " + 60 +" min");
    }
}
