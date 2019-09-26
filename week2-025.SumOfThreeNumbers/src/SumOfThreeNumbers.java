
import java.util.Scanner;

public class SumOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int read; // store numbers read form user in this variable

        System.out.print("Type the first number:");
        read = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number:");
        read = read + Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the third number:");
        read = read + Integer.parseInt(reader.nextLine());

        System.out.println("Sum: " + read);
    }
}
