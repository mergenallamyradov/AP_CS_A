package ClassesCreation.Day_02;

import java.util.ArrayList;

public class ArrayList_02 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(100);
        myList.add(200);

        System.out.println(myList.get(0));
        // Print the element at index 1 of our list: 200
        //System.out.println(myList.get(1));
        System.out.println(myList.get(1));
        System.out.println(myList);
    }
}
