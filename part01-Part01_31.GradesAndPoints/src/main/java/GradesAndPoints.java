
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int marks = Integer.valueOf(scan.nextLine());
        
        if (marks < 0) {
            System.out.println("impossible!");
        } else if (marks <= 49) {
            System.out.println("failed");
        } else if (marks <= 59) {
            System.out.println("1");
        } else if (marks <= 69) {
            System.out.println("2");
        } else if (marks <= 79) {
            System.out.println("3");
        } else if (marks <= 89) {
            System.out.println("4");
        } else if (marks <= 100) {
            System.out.println("5");
        } else if ( marks > 100) {
            System.out.println("incredible!");
        }
    }
}
