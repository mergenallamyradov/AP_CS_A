package ClassesCreation.Day_02;

import java.util.ArrayList;

public class ArrayList_03 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 100; i < 301; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println(evenNumbers);
    }
}
