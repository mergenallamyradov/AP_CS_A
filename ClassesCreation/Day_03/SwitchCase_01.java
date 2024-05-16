package ClassesCreation.Day_03;

import java.util.Scanner;

public class SwitchCase_01 {
    public static void main(String[] args) {

        Scanner car=new Scanner(System.in);
        System.out.println("Enter the type of car you wanna lease");
        String type=car.next().toLowerCase();

        System.out.println("How many days you want to lease");
        int days=car.nextInt();

        switch (type) {
            case "sedan":
                System.out.println("daily price is $30");
                System.out.println("Total payment: " + "$" + days*30);
                break;
            case "suv":
                System.out.println("daily price is $50");
                System.out.println("Total payment: " + "$" + days*50);
                break;

            case "hatchback":
                System.out.println("daily price is $25");
                System.out.println("Total payment: " + "$" + days*50);
                break;
            case  "minivan":
                System.out.println("daily price is $65");
                System.out.println("Total payment: " + "$" + days*65);
                break;
            default:
                System.out.println("Choose from Sedan, SUV, HATCHBACK, MINIVAN");
        }


    }
}
