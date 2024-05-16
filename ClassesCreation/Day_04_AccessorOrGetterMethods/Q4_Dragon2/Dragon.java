package ClassesCreation.Day_04_AccessorOrGetterMethods.Q4_Dragon2;

public class Dragon {
    private String name;
    private int level;
    private boolean canBreatheFire;

    //  constructor with condition!
    public Dragon(String name, int level) {
        this.name = name;
        this.level = level;
        if (level >=70) {             //this.canBreatheFire=(level=>70);
            canBreatheFire = true;
        } else {
            canBreatheFire = false;
        }
    }

    // Getter methods for all 3 attributes
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isCanBreatheFire() {
        return canBreatheFire;
    }

    // attack method for Dragon
    public void attack(){
        if (canBreatheFire){
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        }else{
            System.out.println("~ ~ ~");
        }
    }


   public void gainExperience(){
        level+=10;
        if(level>=70){
            canBreatheFire=true;
        }
   }
}
