package ClassesCreation.Day_05_MutatorOrSetterMethods.Q4_Weekly_Routine;


// 5.5.7
public class Routine {


    private int school;
    private double sleep;
    private double friends;
    private double hobbies;

    //Accessors for each instance variables
    public double getSchool(){
        return school;
    }
    public double getSleep() {
        return sleep;
    }
    public double getFriends() {
        return friends;
    }
    public double getHobbies() {
        return hobbies;
    }

    //Mutators for each attribute
       public void setSchool(double x){
        school=(int)x;
    }
    public void setSleep(double x){
        sleep = x;
    }
    public void setFriends(double x){
        friends=x;
    }
    public void setHobbies(double x) {
        hobbies=x;
    }

    //totalHours method that calculates total amount of time spent per week

    public void printTotal(){
        double total=7*(school+sleep+friends+hobbies);
        System.out.println("How You Spend You Week " + "\nAt school: " +
                school + "\nSleeping: " + sleep+ "\nWith Friends: " + friends +"\nDoing fun stuff: " + hobbies+ "\nYou're busy " + total + " hours a week!" );
    }

}
