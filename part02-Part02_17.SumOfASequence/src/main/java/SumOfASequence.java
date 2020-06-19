
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());
        int result = 0;
        int i = 0;
        
        while (i < input) {
            i++;
            result +=i;  
        }
        System.out.println("The sum is " + result);
        
     
    }
}
