package practice_problem_06;

public class Books {

    public int bookId;
    public String bookName;
    public String bookAuthor;
    public String yearOfPub;
    public float price;
    public String status;

    Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId     = bookId;
        this.bookName   = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub  = yearOfPub;
        this.price      = price;
        this.status     = status;
    }

    void addNewBooks() {
        System.out.println("Message: Successfully Added!!");
    }

    public void deleteBooks() {
        this.status = "deleted";
        System.out.println("Message: Successfully Deleted!!");
    }

    public void displayBookDetails() {

        System.out.println("Book ID   : " + bookId);
        System.out.println("Name      : " + bookName);
        System.out.println("Author    : " + bookAuthor);
        System.out.println("Year      : " + yearOfPub);
        System.out.println("Price     : " + price);
        System.out.println("Status    : " + status);

    }

    public void inquiryBook() {
        System.out.println(
                "Book: " + bookName + "\n" +
                "Author: " + bookAuthor + "\n" +
                "Status: " + status
        );
    }

}
