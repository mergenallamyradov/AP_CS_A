package ClassesCreation.Day_04_AccessorOrGetterMethods.Q1;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

/**
 * This is a constructor.  A constructor is a method
 * that creates an object -- it creates an instance
 * of the class. What that means is it takes the input
 * parameters and sets the instance variables (or fields)
 * to the proper values.
 *
 * Check out StudentTester.java for an example of how to use
 * this constructor.
 */

public Student(String firstName, String lastName, int grade){
    this.firstName=firstName;
    this.lastName=lastName;
    this.gradeLevel=grade;
}

//Getter method to get firstName
    public String getFirstName(){
    return firstName;
    }

 //getter method to get lastName
 public String getLastName() {
     return lastName;
 }

 //getter method to get gradeLevel
    public int getGradeLevel(){
    return gradeLevel;
    }

  //getter method to get gpa
    public double getGpa(){
    return gpa;
    }

  // This is a setter method to set the GPA for the student.
  public void setGPA(double theGPA){
    gpa= theGPA;
    }

    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     */

    public String toString(){
     return firstName + " " + lastName + " is in grade: "+ gradeLevel;
    }

}
