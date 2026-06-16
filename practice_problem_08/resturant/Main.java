package practice_problem_08.resturant;

class Main {
    public static void main(String[] args){

        Restaurant r1 = new FineDiningRestaurant(1200);
        r1.estimateDeliveryTime();
        r1.calculateTotalBill();

        Restaurant r2 = new FastFoodRestaurant(300);
        r2.estimateDeliveryTime();
        r2.calculateTotalBill();
    }
}