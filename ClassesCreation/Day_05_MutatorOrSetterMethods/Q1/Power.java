package ClassesCreation.Day_05_MutatorOrSetterMethods.Q1;

public class Power {
    private String name;
    private int strength;

    public Power(String name, int strength){
        this.name=name;
        this.strength=strength;
    }

    public String getName(){
        return name;
    }

    public int getStrength(){
        return strength;
    }

    //mutators for both variables
    public void setName(String theName){
        name=theName;
    }

    public void setStrength(int theStrength) {
        strength = theStrength;
    }

    //toString() method to modify print function
    public String toString(){
        return "Power: " + name + " Strength: "+ strength;
    }

}
