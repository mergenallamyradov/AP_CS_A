package Inheritance.Q1_ExploreTheExample;

public class PersonTester {
    public static void main(String[] args) {
        /**
         * The Student subclass constructor takes all the information
         * for both the Student object and the Person object
         */

        Student aarav= new Student("Jackson", "11/21/2003", 12, 4.0);
        Student emma = new Student("Emma", "7/18/2004",11, 3.5);

        System.out.println(aarav);
        //System.out.println("Student name: " + aarav.getName());
        //System.out.println("Grade: " + aarav.getGrade());



    }
}
