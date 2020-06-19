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

public class Room {

    private ArrayList<Person> room = new ArrayList<>();

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.size() == 0) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person shortest = this.room.get(0);

        for (Person person : this.room) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }

        }

        return shortest;

    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for (Person person: this.room) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
         
        this.room.remove(shortest);
        
        return shortest;
    }
}
