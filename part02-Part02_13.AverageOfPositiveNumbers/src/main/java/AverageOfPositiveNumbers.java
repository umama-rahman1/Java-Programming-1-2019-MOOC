
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numOfNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.next());
            
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum = sum + input;
                numOfNum = numOfNum + 1;
            }
            
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sum / numOfNum);
        }
    }
}
