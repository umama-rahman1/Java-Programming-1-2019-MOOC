
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentCard blackCard = new PaymentCard(10);
        
        System.out.println(blackCard.balance());
        
        boolean wasSuccessful = blackCard.takeMoney(8);
        
        System.out.println(wasSuccessful);
        System.out.println(blackCard.balance());
        
         PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
        
        
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasItSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasItSuccessful);
        wasItSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasItSuccessful);
        wasItSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasItSuccessful);

        System.out.println(unicafeExactum);
    }
}

