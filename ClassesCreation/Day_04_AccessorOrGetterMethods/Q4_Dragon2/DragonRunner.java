package ClassesCreation.Day_04_AccessorOrGetterMethods.Q4_Dragon2;

public class DragonRunner {
    public static void main(String[] args) {

        Dragon d1=new Dragon("Dorian", 71);
        d1.attack();

        // Printing Dragon's details
        System.out.println("Dragon Name: " + d1.getName());
        System.out.println("Dragon Level: " + d1.getLevel());
        System.out.println("Can Breathe Fire: " + d1.isCanBreatheFire());

        // Dragon gains experience
        d1.gainExperience();
        System.out.println("Dragon gains experience. New level: " + d1.getLevel());

    }

}
