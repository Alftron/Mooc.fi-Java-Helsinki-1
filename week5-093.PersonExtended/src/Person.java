import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                                    Calendar.getInstance().get(Calendar.MONTH) + 1,
                                    Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month =  Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int year =  Calendar.getInstance().get(Calendar.YEAR);
        MyDate todaysDate = new MyDate(day, month, year);
        
        return this.birthday.differenceInYears(todaysDate);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.earlier(compared.birthday)){
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
