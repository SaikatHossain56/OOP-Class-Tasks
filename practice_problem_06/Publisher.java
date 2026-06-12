package practice_problem_06;

public class Publisher {
    private int id;
    private String name;
    private String address;
    private long phoneNo;

    void addPub(int id, String name, String address, long phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;

        System.out.println("Publisher " + name + " is added.");
    }

    public void modifyPub() {
        System.out.println("Publisher modified.");
    }

    public void deletePub() {
        System.out.println("Publisher deleted.");
    }

    public void orderStatus() {
        System.out.println("Checking order status.....");
    }
}
