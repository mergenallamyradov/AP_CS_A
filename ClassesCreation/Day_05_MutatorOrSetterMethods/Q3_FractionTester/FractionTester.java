package ClassesCreation.Day_05_MutatorOrSetterMethods.Q3_FractionTester;

public class FractionTester {
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        Fraction first = new Fraction(1,2);
        Fraction second = new Fraction(1,3);

        // Then add code here to test out your Fraction class!
        System.out.println("BEFORE: ");
        System.out.println("first: " + first);
        System.out.println("Second: " + second);

        // Test addition
        first.add(second);
        System.out.println("\nAFTER ADDITION:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        // Test subtraction
        first.subtract(second);
        System.out.println("\nAFTER SUBTRACTION:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

    }
}


