
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numOfNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input != 0) {
                sum = sum + input;
                numOfNum = numOfNum + 1;
            }
        }
        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of numbers: " + sum);

    }
}
