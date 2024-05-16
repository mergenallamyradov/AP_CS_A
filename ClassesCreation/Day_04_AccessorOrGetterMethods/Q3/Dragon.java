package ClassesCreation.Day_04_AccessorOrGetterMethods.Q3;

public class Dragon {
    private int level;
    private String attack;

    // Constructor
    public Dragon(int level, String attack) {
        this.level = level;
        this.attack = attack;
    }

    // Getter for attack
    public String getAttack() {
        return attack;
    }

    // Getter for level
    public int getLevel() {
        return level;
    }

    // Method to simulate the dragon's fight
    public String fight() {
        String result = "";
        for (int i = 0; i < level; i++) {
            result += attack;
        }
        return result;
    }


    public String toString(){
        return "Dragon is at level " + level + " and attacks with " +attack;
    }
}
