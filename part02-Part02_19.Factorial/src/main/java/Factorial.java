
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        
        int i = 0;
        int result = 1;
        while (i < input) {
            i++;
            result *= i;
        }
        System.out.println("Factorial: " + result);
        
        
        

    }
}
