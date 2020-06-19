
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int sum = 0;
        int num = 0;
        int sumOfPass = 0;
        int numOfPass = 0;
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
                
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("-1")) {
                break;
            }
            
            int number = Integer.valueOf(input);
            
            if ( number >= 0 && number <= 100) {
                sum = sum + number;
                num++;
            }
            
            if (number >= 50 && number <= 100) {
                sumOfPass += number;
                numOfPass++;
            }
            
            if (number < 50 && number >=0) {
                grade0++;
            } else if (number < 60 && number >= 50) {
                grade1++;
            } else if (number < 70 && number >= 60) {
                grade2++;
            } else if (number < 80 && number >= 70) {
                grade3++;
            } else if (number < 90 && number >= 80) {
                grade4++;
            } else if (number <= 100 && number >= 90) {
                grade5++;
            }
        }
        
        double avg = (double) sum/num;
        
        double avgOfPass = 0;
        if (numOfPass > 0) {
            avgOfPass = (double) sumOfPass / numOfPass;
        }
        
        double passPercentage = 100 * ((double) numOfPass / num);
        
        System.out.println("Point average (all): " + avg);
        
        if (numOfPass == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + avgOfPass); 
        }
        
        System.out.println("Pass percentage: " + passPercentage);
        
        System.out.print("5:");
        printStars(grade5);
        
        System.out.println("");
        
        System.out.print("4:");
        printStars(grade4);
        
        System.out.println("");
        
        System.out.print("3:");
        printStars(grade3);
        
        System.out.println("");
        
        System.out.print("2:");
        printStars(grade2);
        
        System.out.println("");
        
        System.out.print("1:");
        printStars(grade1);
        
        System.out.println("");
        
        System.out.print("0:");
        printStars(grade0);
        
    } 
    
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
}
