package ClassesCreation.Day_05_MutatorOrSetterMethods.Q1;

public class SuperHero {
    private String name;
    private Power superPower;

    //power attribute is referencing power object, hence power class methods should be implemented.
    public SuperHero(String heroName, Power power) {
        name = heroName;
        superPower = new Power(power.getName(), power.getStrength());
    }

        public int getStrength(){
            return superPower.getStrength();
        }

        // mutator
        public void setStrength(int strength){
        //validate strength is at least 0
        if (strength<0){
            strength=0;
        }
        superPower.setStrength(strength);
    }

    public void setName(String theName){
        name=theName;
    }

    //IMPORTANT PART
    public void setPower(String name, int strength){
        superPower.setName(name);
        superPower.setStrength(strength);
    }

    public String toString()
    {
        return "Name: "+ name +", " + superPower;
    }






}
