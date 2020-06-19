
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int longest = 0;
        String longName = "random";
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] part = input.split(",");
            
            sum = sum + Integer.valueOf(part[1]);
            count++;
            
            if (longest < part[0].length()) {
                longest = part[0].length();
                longName = part[0];   
            }
            
            
        }
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + ((double) sum / count));
    }
}
