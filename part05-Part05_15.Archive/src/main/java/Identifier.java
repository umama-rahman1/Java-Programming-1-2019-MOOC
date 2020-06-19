/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umama
 */
public class Identifier {

    private String identifier;
    private String name;

    public Identifier(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Identifier)) {
            return false;
        }
        
        Identifier comparedProduct = (Identifier) compared;
        
        if (this.identifier.equals(comparedProduct.identifier)) {
            return true;
        } 
        
        return false;
    }
    
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
}
