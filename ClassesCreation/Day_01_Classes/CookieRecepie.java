package ClassesCreation.Day_01_Classes;

// CookieRecipe class (the class is like a recipe)
class CookieRecipe {
    // Ingredients (attributes)
    String flour;
    String sugar;
    int eggs;

    // Constructor (gathering ingredients and preparing)
    CookieRecipe(String flourType, String sugarType, int numEggs) {
        flour = flourType;
        sugar = sugarType;
        eggs = numEggs;
        System.out.println("Ingredients gathered and bowl is ready!");
    }

    // Method to mix ingredients and bake cookies
    void mixAndBake() {
        System.out.println("Mixing " + flour + ", " + sugar + ", and " + eggs + " eggs.");
        System.out.println("Baking delicious cookies!");
    }
    // Main class
        public static void main(String[] args) {
            // Creating an object of the CookieRecipe class (baking cookies)
            CookieRecipe myCookies = new CookieRecipe("All-purpose flour", "White sugar", 2);

            // Calling the mixAndBake method to make cookies
            myCookies.mixAndBake();
        }
    }



