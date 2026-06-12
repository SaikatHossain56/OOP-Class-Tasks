package practice_problem_05;

public class LibrarySystem {
    private String author;
    private String title;

    LibrarySystem(String title){
        this.title = title;
    }
    LibrarySystem(String title, String author){
        this.author = author;
        this.title = title;
    }

    void getInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author + "\n");
    }
}
