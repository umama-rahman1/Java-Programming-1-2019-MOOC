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

public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public void addGift(Gift gift) { 
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift: gifts) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
    
}
