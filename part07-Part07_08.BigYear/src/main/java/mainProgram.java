
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        ArrayList<Bird> birdList = new ArrayList<>();
        ArrayList<Bird> observationList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            //Stop command 
            if (command.equals("Quit")) {
                break;
            }
            
            //Add Command
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                birdList.add(new Bird(name, latinName));
            }
            
            // Observation command
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                boolean found = false;
                
                for (int i = 0; i < birdList.size(); i++) {
                    if (birdList.get(i).getName().equals(bird)) {
                        birdList.get(i).addObservation();
                        found = true;
                    }
                }
                
                if (!found) {
                    System.out.println("Not a bird!");
                }

            } 
            
            // Prints one bird
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                
                for (int i = 0; i < birdList.size();i++) {
                    if (birdList.get(i).getName().equals(bird)) {
                        System.out.println(birdList.get(i));
                    }
                }
            }
            
            // Prints all birds
            if (command.equals("All")) {
                for (int i = 0; i < birdList.size(); i++) {
                    System.out.println(birdList.get(i));
                }
            }

        } 
        

    }

}
