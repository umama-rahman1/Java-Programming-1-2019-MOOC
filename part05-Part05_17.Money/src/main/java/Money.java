
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public Money minus(Money subtraction) {
        /*int euro = 0;
        int cent = 0;
        if (this.euros - addition.euros <= 0) {
            euro = 0;
        } else {
            euro = this.euros - addition.euros;
        }
        
        if (this.cents - addition.cents <= 0) {
            cent = 0;
            if (this.cents < addition.cents) {
                euro = euro - 1;
            }
        } else {
            cent = this.cents - addition.cents;
        }
        
        Money newMoney = new Money(euro,cent);
        return newMoney; */
        int euroDiff = this.euros - subtraction.euros;
        int centDiff = this.cents - subtraction.cents;
        int totalDiffInCents = euroDiff*100 + centDiff;
        
        if (totalDiffInCents <= 0) {
            return new Money(0,0);
        } else {
            int euro = totalDiffInCents/100;
            int cent = totalDiffInCents%100;
            return new Money(euro, cent);
        }
    }
    
    public boolean lessThan(Money compare) {
        if (this.euros < compare.euros) {
            return true;
        } else if (this.euros == compare.euros && this.cents < compare.cents) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
