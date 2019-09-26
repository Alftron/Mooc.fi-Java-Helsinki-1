
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        Money sum = new Money(this.euros + added.euros, this.cents + added.cents);
        return sum;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented) {

        int euros = 0;
        int cents = 0;
        int eurosToMinus = 0;
        
        cents = this.cents - decremented.cents;
        if (this.cents - decremented.cents < 0) {
            eurosToMinus++;
            cents += 100;
        }
        euros = this.euros - decremented.euros - eurosToMinus;
        if (euros < 0) {
            euros = 0;
            cents = 0;
        }
        Money minus = new Money(euros, cents);
        return minus;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
