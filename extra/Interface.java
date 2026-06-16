package extra;

interface Tossable{
    public void toss();
}

class Ball implements Tossable{
    private String brandName;

    Ball(String brandName){
        this.brandName = brandName;
    }
    public String getBrandName(){
        return brandName;
    }

    @Override
    public void toss() {
        System.out.println("Ball Tossed.");
    }

    public void bounce(){
        System.out.println("Ball is bouncing.");
    }
}

class Rock implements Tossable{

    @Override
    public void toss() {
        System.out.println("Rock Tossed.");
    }
}

class BaseBall extends Ball{

    BaseBall(String brandName) {
        super(brandName);
    }
    public String getBrandName(){
        return super.getBrandName();
    }

    @Override
    public void toss() {
        System.out.println("Ball Tossed.");
    }

    public void bounce(){
        System.out.println("Ball is bouncing.");
    }

}
public class Interface {
    public static void main(String[] args){

    }

}
