package practice_problem_06;

import java.util.ArrayList;

public class Librarian {

    private int id;
    private String name;

    Librarian(int id, String name){
        this.id = id;
        this.name = name;
    }
    void searchBook(String name){
        System.out.println("Searching the book: " + name );
    }
    boolean verifyMember(int id){
        if(id >= 0 && id <= 1000) return true;
        return false;
    }

    void orderBooks(){
        System.out.println("Books have been ordered!");
    }

    void sellBooks(){
       System.out.println("Books have been sold.");
    }
}
