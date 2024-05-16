package ClassesCreation.Day_04_AccessorOrGetterMethods.Q5_Chefs_Best_Meal;

public class Meal {
    private String name;
    private String course;
    private int numOfServings;

    public Meal(String name, String course, int numOfServings){
        this.name=name;
        this.course=course;
        this.numOfServings=numOfServings;
    }


    // getter methods
    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getNumOfServings() {
        return numOfServings;
    }

    @Override
    public String toString() {
        return name + " (" + course + ")";
    }
}
