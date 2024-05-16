package ClassesCreation.Day_01_Classes;

//Class creation
public class Dog_constructors {

    // Attribute(s)
    String name="Bob";
    int age;

    // Constructor #1
    public Dog_constructors(String dogName) {
        name = dogName; }

    // Create another constructor that accepts both name and age
    public Dog_constructors(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }


    // Method to display the name
    public void display() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);


    }

    // Method to calculate the age (return Choclate)




    // Main class
    public static void main(String[] args) {
        // Creating an object of the Dog class and passing the name through constructor
        Dog_constructors myDog = new Dog_constructors("Buddy");  // 1st constructor
        Dog_constructors myDog2 = new Dog_constructors("Arav", 7);

        // Displaying the name using the method
        myDog.display();
        myDog2.display();



    }
}


