/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martinh
 */
public class LyyraCard
{
    private double balance;
    
    public LyyraCard(double balanceAtStart)
    {
        this.balance = balanceAtStart;
    }
    
    public String toString()
    {
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical()
    {
        double economicalRate = 2.50;
        if (this.balance - economicalRate >= 0.00)
        {
            this.balance -= economicalRate;
        }
    }
    
    public void payGourmet()
    {
        double gourmetRate = 4.00;
        if (this.balance - gourmetRate >= 0.00)
        {
            this.balance -= gourmetRate;
        }
    }
    
    public void loadMoney(double amount)
    {
        if (amount > 0.00)
        {
            this.balance += amount;
            double maxAmount = 150.00;
            if (this.balance > maxAmount)
            {
                this.balance = maxAmount;
            }
        }
    }
}
