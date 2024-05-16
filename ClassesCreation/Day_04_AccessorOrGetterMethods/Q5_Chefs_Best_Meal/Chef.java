package ClassesCreation.Day_04_AccessorOrGetterMethods.Q5_Chefs_Best_Meal;

class Chef {
    private String name;
    private String restaurant;
    private Meal bestMeal;

    public Chef(String name, String restaurant, Meal bestMeal) {
        this.name = name;
        this.restaurant = restaurant;
        this.bestMeal = bestMeal;
    }

    public String getName() {
        return name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getMealName() {
        return bestMeal.getName();
    }

    public int getMealServings() {
        return bestMeal.getNumOfServings();
    }

    public String getMealCourse() {
        return bestMeal.getCourse();
    }

    @Override
    public String toString() {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + bestMeal.toString();
    }
}
