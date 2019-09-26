
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.00;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double price = 2.50;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.economicalSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double price = 2.50;
        if (card.balance() - price >= 0.00) {
            this.economicalSold++;
            card.pay(price);
            return true;
        }
        return false;
    }
    

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double price = 4.00;
        if (cashGiven >= price) {
            this.cashInRegister += price;
            this.gourmetSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        double price = 4.00;
        if (card.balance() - price >= 0.00) {
            this.gourmetSold++;
            card.pay(price);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0.00) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
