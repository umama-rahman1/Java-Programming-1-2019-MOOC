
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.rooms > compared.rooms) {
            return true;
        }

        if (this.rooms < compared.rooms) {
            return false;
        }

        if (this.squares > compared.squares) {
            return true;
        }

        return false;

    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;

        if (thisPrice > comparedPrice) {
            return thisPrice - comparedPrice;
        }
        return comparedPrice - thisPrice;

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.squares * this.pricePerSquare;
        int comparedPrice = compared.squares * compared.pricePerSquare;

        if (thisPrice > comparedPrice) {
            return true;
        }
        return false;
    }

}
