package ClassesCreation.Day_05_MutatorOrSetterMethods.Q4_Weekly_Routine;

public class RoutineTester {
    public static void main(String[] args)
    {
        Routine ashlyn = new Routine();

        ashlyn.setSchool(8);
        ashlyn.setHobbies(3);
        ashlyn.setFriends(2.5);
        ashlyn.setSleep(8);

        Routine bob= new Routine();
        bob.setSchool(7);
        bob.setHobbies(1);
        bob.setFriends(375);
        bob.setSleep(24);


        // Prints the totals for the WHOLE WEEK
        ashlyn.printTotal();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        bob.printTotal();
    }



}
