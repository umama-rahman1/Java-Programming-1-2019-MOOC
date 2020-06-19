
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the numbers:");
        int beginning = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(beginning, end);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int i = beginning;
        while (i >= beginning && i <= end) {
            if (i % 3 == 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    }
}
