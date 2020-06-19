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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> hold = new ArrayList<>();
    private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((totalWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.hold.add(suitcase);
            totalWeight = totalWeight + suitcase.totalWeight();
        }

    }

    public String toString() {
        int total = 0;
        for (int i = 0; i < this.hold.size(); i++) {
            total = total + this.hold.get(i).totalWeight();
        }
        return this.hold.size() + " suitcases (" + total + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.hold) {
            suitcase.printItems();
        }
    }

}
