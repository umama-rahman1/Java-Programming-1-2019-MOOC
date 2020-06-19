

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(6);
    }
    
    public static void printUntilNumber( int numOfTimes) {
        int i = 1;
        while (i <= numOfTimes) {
            System.out.println(i);
            i++;
        }
    }

}
