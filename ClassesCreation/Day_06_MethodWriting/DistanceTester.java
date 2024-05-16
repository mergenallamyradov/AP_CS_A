package ClassesCreation.Day_06_MethodWriting;

public class DistanceTester {
    public static void main(String[] args) {
        Distance d1=new Distance(60);
        Distance d3=new Distance(90);
        Distance d4=new Distance(100);

        //Conversion
        System.out.println(d1);
        System.out.println("Distance in Miles: " + d1.toMiles() + " //Original value: " + d1.getKilometers() + "km.");
        System.out.println("Distance in leagues: " + d1.toLeagues() + " //Original value: " + d1.getKilometers() + "km.");
    }
}
