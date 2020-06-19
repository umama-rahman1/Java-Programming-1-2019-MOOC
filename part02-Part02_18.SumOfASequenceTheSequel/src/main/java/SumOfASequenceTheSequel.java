
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        
        int i = first;
        while (i < last) {
            i++;
            first +=i;
        }
        System.out.println("The sum is: " + first);
    }
}
