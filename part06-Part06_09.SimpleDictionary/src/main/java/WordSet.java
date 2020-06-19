/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umama
 */
public class WordSet {
    private String word;
    private String translation;
    
    public WordSet(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }
    
    public String getTranslation() {
        return this.translation;
    }
    
    public String getWord() {
        return this.word;
    }
}
