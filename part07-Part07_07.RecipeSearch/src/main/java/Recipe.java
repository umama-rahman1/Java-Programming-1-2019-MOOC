import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingr) {
        this.name = name;
        this.time = time;
        this.ingredients = ingr;
    }
    
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.time;
    }
    public ArrayList<String> getIngr() {
        return this.ingredients;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public void setIngr(ArrayList<String> ingr) {
        this.ingredients = ingr;
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
}