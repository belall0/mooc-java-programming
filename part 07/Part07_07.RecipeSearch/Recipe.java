
import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }

    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }

}
