
import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int remainder = num % 2;
        
        if (remainder != 0)
        {
            System.out.println("Number " + num + " is odd.");
        }
        else
        {
            System.out.println("Number " + num + " is even.");
        }
    }
}
