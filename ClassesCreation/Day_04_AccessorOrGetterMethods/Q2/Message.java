package ClassesCreation.Day_04_AccessorOrGetterMethods.Q2;

public class Message {

    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        // Then use the accessor methods to print out the instance variables
        Comment aumGandhi = new Comment("Aumlicius", "Hello my name is Aum Gandhi" , "Friday, 2020");
        Comment x = new Comment("pdiddy" , "Hello!" , "June 6th, 1984");

        System.out.println(x.getPoster());
        System.out.println(aumGandhi.getPoster());

        System.out.println(x);



    }
}

