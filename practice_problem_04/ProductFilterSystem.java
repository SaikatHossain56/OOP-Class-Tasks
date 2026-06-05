package practice_problem_04;

class Category{
    String category;

    Category(String category){
        this.category = category;
    }
}

class Brand{
    String brand;

    Brand(String brand){
        this.brand = brand;
    }
}
public class ProductFilterSystem {

    private void filterProducts(Category c){
        System.out.println("filter " + c.category +" products");
    }
    private void filterProducts(double starting, double ending){
        System.out.println("filter products in range: " + starting + " to " + ending);
    }
    private void filterProducts(Brand b){
        System.out.println("filter products of: " + b.brand);
    }
    private void filterProducts(Category c, double s, double e){
        System.out.print("filter " + c.category + " products");
        System.out.println( " from " + s + " to " + e );
    }
    private void filterProducts(Category c, double s, double e, Brand b){
        System.out.print("filter " + c.category);
        System.out.print( " of " + b.brand);
        System.out.println( " from "+ s + " to " + e );
    }



    public static void main(String[] args){

        ProductFilterSystem product = new ProductFilterSystem();
        product.filterProducts(new Category("Electronics"));
        product.filterProducts(100.00, 500.00);
        product.filterProducts(new Brand("Apple"));
        product.filterProducts(new Category("fashion"), 300.00, 1000.00);
        product.filterProducts(new Category("Watches"), 1000.00, 2000.00, new Brand("Casio"));

    }
}
