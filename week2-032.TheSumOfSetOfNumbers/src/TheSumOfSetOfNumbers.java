
import java.util.Scanner;

public class TheSumOfSetOfNumbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int upTo = Integer.parseInt(reader.nextLine());
        int count = 1;
        int sum = 0;
        while (count <= upTo)
        {
            sum += count;
            count++;
        }
        System.out.println("Sum is " + sum);
    }
}
