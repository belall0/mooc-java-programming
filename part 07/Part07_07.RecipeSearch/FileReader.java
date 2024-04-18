
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {

    public static void readRecipes(String fileName, ArrayList<Recipe> recipes) {

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            ArrayList<String> container = new ArrayList<>();

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                if (line.equals("")) {
                    recipes.add(extractRecipe(container));
                    continue;
                }

                container.add(line);
            }

            // add the last recipe
            recipes.add(extractRecipe(container));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static Recipe extractRecipe(ArrayList<String> container) {
        String recipeName = container.get(0);
        int cookingTime = Integer.valueOf(container.get(1));
        ArrayList<String> recipeIngredients = new ArrayList<>();

        for (int i = 2; i < container.size(); i++) {
            recipeIngredients.add(container.get(i));
        }

        Recipe newRecipe = new Recipe(recipeName, cookingTime, recipeIngredients);
        container.clear();

        return newRecipe;
    }
}
