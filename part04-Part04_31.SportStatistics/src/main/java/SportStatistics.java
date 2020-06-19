
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String input = scan.nextLine();

        ArrayList<String> list = new ArrayList<>();

        int games = 0;
        int wins = 0;
        int loss = 0;
        
        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                String[] parts = line.split(",");
                String teamOne = parts[0];
                String teamTwo = parts[1];
                String onePoints = parts[2];
                String twoPoints = parts[3];

                if (teamOne.equals(input) || teamTwo.equals(input)) {
                    games++;
                }
                
                if (teamOne.equals(input) && Integer.valueOf(onePoints) > Integer.valueOf(twoPoints)) {
                    wins++;
                }  else if (teamOne.equals(input) && Integer.valueOf(onePoints) < Integer.valueOf(twoPoints)) {
                    loss++;
                } else if (teamTwo.equals(input) && Integer.valueOf(twoPoints) > Integer.valueOf(onePoints)) {
                    wins++;
                } else if (teamTwo.equals(input) && Integer.valueOf(twoPoints) < Integer.valueOf(onePoints)) {
                    loss++;
                }
              
            }

        } catch (Exception e) {
            System.out.println("Error: You have failed in life!");
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loss);
        

    }

}
