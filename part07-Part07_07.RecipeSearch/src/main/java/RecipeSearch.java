
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        //ArrayList<String> ingredients = new ArrayList<>();

        //adding reciepes to list
        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.isEmpty()) {
                    String recipeName = list.get(0);
                    int cookingTime = Integer.valueOf(list.get(1));
                    ArrayList<String> ingredients = new ArrayList<>();
                    for (int i = 2; i < list.size(); i++) {
                        ingredients.add(list.get(i));
                    }
                    recipes.add(new Recipe(recipeName, cookingTime, ingredients));
                    list.clear();
                } else {
                    list.add(row);
                }
            }
            String recipeName = list.get(0);
                int cookingTime = Integer.valueOf(list.get(1));
                ArrayList<String> ingredients = new ArrayList<>();
                    for (int i = 2; i < list.size(); i++) {
                        ingredients.add(list.get(i));
                    }
                    recipes.add(new Recipe(recipeName, cookingTime, ingredients));
                    list.clear();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");

        while (true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            
            // list command
            if (command.equals("list")) {
                System.out.println("Recipes:");
                for (int i = 0; i < recipes.size();i++) {
                    System.out.println(recipes.get(i));
                }
            }
            
            // find name command
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                
                System.out.println("");
                System.out.println("Recipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getName().contains(word)) {
                        System.out.println(recipes.get(i));
                    }
                }
            } 
            
            // cooking time command
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                
                System.out.println("");
                System.out.println("Recipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getTime() <= time) {
                        System.out.println(recipes.get(i));
                    }
                }
            }
            
            // find ingredient command
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
               
                System.out.println("");
                System.out.println("Recipes: ");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getIngr().contains(ingredient)) {
                        System.out.println(recipes.get(i));
                    }
                }
                
                
            }
            
        }
    }

}
