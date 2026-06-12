package practice_problem_06;

public class Main {
    public static void main(String[] args){

        Books b1 = new Books(1, "Dune", "Frank Herbert", "1965", 500.0f, "available");
        b1.addNewBooks();
        b1.displayBookDetails();
        b1.deleteBooks();
        b1.inquiryBook();

        Librarian l1 = new Librarian(1, "Saikat Hossain");
        l1.searchBook("Dune");
        if(l1.verifyMember(1))
            System.out.println("Member is active.");
        else
            System.out.println("Member is not active");
        l1.orderBooks();
        l1.sellBooks();

        Publisher p1 = new Publisher();
        p1.addPub(01, "Mr. Khurshed", "12/B, Wolf Street", 0547);
        p1.modifyPub();
        p1.deletePub();
        p1.orderStatus();

        User u1 = new User(1, "Saimul Alam", "12/B Nandan Road, Dhaka", 05432);
        u1.returnBooks();
        u1.addNewUser();
        u1.deleteUser();
        u1.updateDetails();
        u1.bookPurchase();


    }
}
