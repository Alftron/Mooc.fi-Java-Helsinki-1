/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Counter {
    private int counterNum;
    boolean counterCheck;
    
    public Counter() {
        this.counterNum = 0;
        this.counterCheck = false;
    }
    
    public Counter(boolean check) {
        this.counterNum = 0;
        this.counterCheck = check;
    }
    
    public Counter(int startingValue) {
        this.counterNum = startingValue;
        this.counterCheck = false;
    }
    
    public Counter(int startingValue, boolean check) {
        this.counterNum = startingValue;
        this.counterCheck = check;
    }
    
    public int value() {
        return this.counterNum;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.counterNum += increaseAmount;
        }
    }
    
    public void decrease() {
        decrease(1);
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.counterCheck) {
                    if ((this.counterNum - decreaseAmount) < 0) {
                        this.counterNum = 0;
                    }
                    else {
                        this.counterNum -= decreaseAmount;
                    }       
            }
            else  {
                this.counterNum -= decreaseAmount;
            }
        }
    }
}
