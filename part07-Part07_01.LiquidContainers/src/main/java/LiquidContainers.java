
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aAmount = 0;
        int bAmount = 0;

        while (true) {
            System.out.println("");
            System.out.println("First: " + aAmount + "/100");
            System.out.println("Second: " + bAmount + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // add command
            if (command.equals("add")) {
                if (aAmount < 100 && amount > 0) {
                    if ((amount + aAmount) >= 100) {
                        aAmount = 100;
                        continue;
                    }
                    if ((amount + aAmount) <= 100) {
                        aAmount = aAmount + amount;
                        continue;
                    }
                }
            }

            // move command
            if (command.equals("move")) {

                if (aAmount > 0 && aAmount < amount) {
                    bAmount = bAmount + aAmount;
                    aAmount = 0;
                    continue;
                }
                if (aAmount >= amount) {
                    if (bAmount + amount <= 100) {
                        aAmount = aAmount - amount;
                        bAmount = bAmount + amount;
                        continue;
                    }
                    if (bAmount + amount > 100) {
                        aAmount = aAmount - amount;
                        bAmount = 100;
                        continue;
                    }
                }
                
            }

                // remove command
                if (command.equals("remove")) {
                    if ((bAmount - amount) >= 0) {
                        bAmount = bAmount - amount;
                        continue;
                    }
                    if (amount > bAmount) {
                        bAmount = 0;
                        continue;
                    }

                }
            
        }
    }
}
