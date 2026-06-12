package practice_problem_06;

import java.time.LocalDate;

public class User {
    private int userID;
    private String userName;
    private String userAddress;
    private int phoneNo;

    public User(int userID, String userName, String userAddress, int phoneNo) {
        this.userID = userID;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    public void returnBooks() {
        System.out.println("Book returned.");
    }

    public int payFine(LocalDate date) {
        LocalDate today = LocalDate.now();

        if(today.isAfter(date)) {
            return 1000;
        }
        return 0;
    }

    public void addNewUser() {
        System.out.println("New User added.");
    }

    public void deleteUser() {
        System.out.println("User deleted.");
    }

    public void updateDetails() {
        System.out.println("User details updated.");
    }

    public void bookPurchase() {
        System.out.println("Book purchased.");
    }
}
