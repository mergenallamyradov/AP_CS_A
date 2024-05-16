package ClassesCreation.Day_06_MethodWriting;

public class Distance {
    double kilometers;

    //Constructor
    public Distance(double kilometers) {
        this.kilometers = kilometers;
    }
    public double toMiles(){
        return kilometers/1.609;
    }
    public double toLeagues(){
        return kilometers/5.556;
    }

    public double getKilometers() {
        return kilometers;
    }
    // Method to convert kilometers to double miles
    public double doubleMiles() {
        return toMiles() * 2;
    }

    public String toString(){
        return kilometers + "km = " + toMiles() + " miles";
   }
}
