package ClassesCreation.Day_04_AccessorOrGetterMethods.Q3;

public class DragonRunner {
    public static void main(String[] args) {
       //Create a Dragon her to test out the Dragon class

       Dragon drakaris=new Dragon(5, ">");
        System.out.println(drakaris.getLevel());
        System.out.println(drakaris.getAttack());
        System.out.println(drakaris.fight());
        System.out.println();
        System.out.println(drakaris);
    }
}
