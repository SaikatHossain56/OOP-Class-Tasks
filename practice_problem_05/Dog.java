package practice_problem_05;

public class Dog {
    private String name;
    private int age;
    private String breed;

   Dog (String name, int age, String breed){
       this.name = name;
       this.age = age;
       this.breed = breed;
   }

   void bark(){
       System.out.println(name + " is barking");
   }
   void spin(){
       System.out.println(name + " is spinning");
   }
   void run(){
       System.out.println(name + " is running");
   }
   String getName(){
       return name;
   }
   int getAge(){
       return age;
   }
   String getBreed(){
       return breed;
   }
}
