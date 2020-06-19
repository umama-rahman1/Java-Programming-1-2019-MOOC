
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int greatest = 0;
        String oldest = "random";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] part = input.split(",");
            
            if (greatest < Integer.valueOf(part[1])) {
                greatest = Integer.valueOf(part[1]);
                oldest = part[0];
            }
        }
        //System.out.println(greatest);
        System.out.println("Name of the oldest: " + oldest);
    }
}
