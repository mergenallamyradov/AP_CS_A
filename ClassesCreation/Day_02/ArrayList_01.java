package ClassesCreation.Day_02;

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Michael");
        names.add("Lebron");
        names.add("Serena");
        names.add("Shaq");
        String firstName = names.remove(0);
        String secondName = names.set(0, "Venus");
        names.add(2,firstName);
        System.out.println(firstName);
        System.out.println(secondName);

    }


}
