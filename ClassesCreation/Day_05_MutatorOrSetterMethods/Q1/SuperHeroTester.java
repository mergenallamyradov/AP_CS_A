package ClassesCreation.Day_05_MutatorOrSetterMethods.Q1;

public class SuperHeroTester {
    public static void main(String[] args)
    {
       Power speed =new Power("Super speed", 10);
       SuperHero flash = new SuperHero("The flash", speed);

        System.out.println(flash);
        flash.setStrength(-10);
        //You cannot have negative strength
        System.out.println(flash);
        System.out.println("\nUpdating Flash's Power");

        //Mutator method to change the Power of flash
        flash.setPower("Light Speed", 100);
        System.out.println("\n"+flash);

    }
}
