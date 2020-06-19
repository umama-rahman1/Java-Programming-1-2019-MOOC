
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
         /*Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book); */
        
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package books = new Package();
        books.addGift(book);
        System.out.println(books.totalWeight());
    }
}
