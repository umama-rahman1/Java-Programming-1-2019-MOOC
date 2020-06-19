
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (!(input.equals("end"))) {
                count++;
            } else if (input.equals("end")) {
                break;
            }
        }
        
        System.out.println(count);
    }
}
