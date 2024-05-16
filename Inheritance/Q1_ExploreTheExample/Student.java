package Inheritance.Q1_ExploreTheExample;

public class Student extends Person {
    private int grade;
    private double gpa;

    /**
     * The Student object only stores grade and gpa. Notice
     * how the contructor takes all 4 variables and passes
     * two of them up to the Person superclass
     */

    public Student(String name, String birthday, int grade, double gpa){
        super(name, birthday); //passes to superclass
        this.grade=grade; // Stored in the Student object
        this.gpa=gpa; // Stored in the Student Object
    }

    public int getGrade(){
        return grade;
    }
    public double getGpa(){
        return gpa;
    }

}
