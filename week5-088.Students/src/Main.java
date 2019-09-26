
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            Student person = new Student(name, number);
            list.add(person);
        }
        
        for (Student person : list) {
            System.out.println(person);
        }
        
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        System.out.println("Result:");
        for (Student person : list) {
            if (person.getName().contains(term)) {
                System.out.println(person);
            }
        }
    }
}
