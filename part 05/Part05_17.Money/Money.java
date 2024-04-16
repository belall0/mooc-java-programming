
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
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        totalEuros += totalCents / 100;
        totalCents = totalCents % 100;

        return new Money(totalEuros, totalCents);

    }

    public Money minus(Money decreaser) {
        int totalEuros = this.euros - decreaser.euros;
        int totalCents = this.cents - decreaser.cents;

        if (totalCents < 0) {
            totalEuros--;
            totalCents = 100 - (-1 * totalCents);
        }

        if (totalEuros < 0) {
            totalEuros = 0;
            totalCents = 0;
        }

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
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
