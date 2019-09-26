
import java.util.ArrayList;


public class Phonebook {
    private ArrayList<Person> list;
    
    public Phonebook() {
        list = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person entry = new Person(name, number);
        list.add(entry);
    }
    
    public void printAll() {
        for (Person entry : list) {
            System.out.println(entry);
        }
    }
    
    public String searchNumber(String name) {
        for (Person entry : list) {
            if (entry.getName().equals(name)) {
                return entry.getNumber();
            }
        }
        return "number not known";
    }
}
