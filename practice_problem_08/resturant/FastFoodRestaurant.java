package practice_problem_08.resturant;

public class FastFoodRestaurant extends Restaurant{
    FastFoodRestaurant(double foodPrice){
        this.price = foodPrice;
        this.tax = (double) 15/100;
    }
    @Override
    void calculateTotalBill() {
        System.out.println("Your total bill is: " +( price + (price * tax)) +" Tk.");
    }
    @Override
    void estimateDeliveryTime(){
       System.out.println("Estimated Delivery Time: " + 20 +" min");
    }
}
