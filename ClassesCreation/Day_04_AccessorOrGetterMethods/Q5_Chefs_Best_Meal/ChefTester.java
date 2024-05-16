package ClassesCreation.Day_04_AccessorOrGetterMethods.Q5_Chefs_Best_Meal;

public class ChefTester {
    public static void main(String[] args) {

        // Don't modify this part!
        Meal macaroni = new Meal("Mac N Cheese", "Lunch", 8);
        Chef alex = new Chef("Alex", "Juniors Cheesecake", macaroni);

        System.out.println(alex);
        System.out.println(alex.getMealName());

        // Create your own Meal and Chef here:

        Meal kebap = new Meal("Brazillian steak", "lunch", 15);
        Chef morgan = new Chef("Mergen", "Aspava", kebap);

        System.out.println(morgan);
        System.out.println(morgan.getMealName());
    }
}
