package ClassesCreation.Day_01_Classes;


// Assume I have 100 dogs

//Class creation
public class Dog {

    String name;
    int age;

    //Method to set the name
    public void setName(String newName){
        name=newName; }

    //method to display name
    void display(){
        System.out.println("My name is: " + name); }


    //Main class to run the code
    public static void main(String[] args) {

        //Creating an object of the Dog class without constructors
        Dog d1= new Dog();
        d1.setName("Sharik");
        Dog d2= new Dog();
        d2.setName("John");

        //Displaying the name using method
        d1.display();
        d2.display();

    }

}


