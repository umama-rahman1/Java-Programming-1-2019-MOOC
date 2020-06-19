
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        System.out.println("Sum: " + total);
    }
}