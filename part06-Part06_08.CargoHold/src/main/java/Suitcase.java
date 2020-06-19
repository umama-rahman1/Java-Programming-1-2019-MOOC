/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umama
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {

        if ((item.getWeight() + this.totalWeight) <= maxWeight) {
            this.items.add(item);
            totalWeight = totalWeight + item.getWeight();
        }

    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight + " kg)";
        }
        return this.items.size() + " items " + "(" + this.totalWeight + " kg)";
    }

    public void printItems() {                                        
         for (Item item: this.items) {
             System.out.println(item);
         }     
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
}
