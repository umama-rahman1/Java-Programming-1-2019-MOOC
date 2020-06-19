
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] part = input.split(",");

            if (greatest < Integer.valueOf(part[1])) {
                greatest = Integer.valueOf(part[1]);
            }

        }

        System.out.println("Age of the oldest: " + greatest);

    }

}
