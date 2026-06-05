package practice_problem02;

public class SeriesLoop {
    public static void main(String[] args) {
        System.out.println("Series printing using for loop: ");
        System.out.print("Even: ");
        for(int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.print("\nOdd: ");
        for(int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n");

        System.out.println("Series printing using while loop: ");
        System.out.print("Even: ");

        int i = 2;
        while(i <= 20){
            System.out.print(i + " ");
            i+=2;
        }
        System.out.print("\nOdd: ");
        i = 1;
        while(i <= 19){
            System.out.print(i + " ");
            i+=2;
        }

        System.out.println("\n\n");

        System.out.println("Series printing using do while loop: ");
        System.out.print("Even: ");

        i = 2;
        do{
            System.out.print(i + " ");
            i+=2;
        } while(i <= 20);

        System.out.print("\nOdd: ");
        i = 1;
        do{
            System.out.print(i + " ");
            i+=2;
        }while(i <= 19);
    }
}
