
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation sexHospital = new HealthStation();
        
        Person jennifer = new Person("Jennifer", 18, 160, 69);
        
        sexHospital.feed(jennifer);
        
        System.out.println(jennifer.getName() + ", " + sexHospital.weigh(jennifer));
        
        sexHospital.weigh(jennifer);
        sexHospital.weigh(jennifer);
        
        System.out.println(sexHospital.weighings());
    }
}
