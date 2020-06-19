
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        int numberCount = count;
    }
    
    public void addNumber(int number) {
        sum = sum + number;
        count++;
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        if (sum != 0) {
            return ((double) sum/count);
        } else {
            return 0;
        }
    }
}
