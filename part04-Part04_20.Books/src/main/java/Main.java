
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, year));

        }

        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book infoOut : bookList) {
                System.out.println(infoOut);
            }
        } else if (input.equals("name")) {
            for (Book infoOut : bookList) {
                System.out.println(infoOut.getName());
            }
        }
    }
}
