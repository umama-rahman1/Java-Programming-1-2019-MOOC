
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter timesYouHadSex = new Counter();
        Counter timesYouGotDumped = new Counter(2);
        
        
        System.out.println(timesYouHadSex.value());
        timesYouHadSex.increase();
        
        System.out.println(timesYouHadSex.value());
        
        System.out.println(timesYouGotDumped.value());
        
        timesYouGotDumped.decrease(1);
        System.out.println(timesYouGotDumped.value());
    }
}
