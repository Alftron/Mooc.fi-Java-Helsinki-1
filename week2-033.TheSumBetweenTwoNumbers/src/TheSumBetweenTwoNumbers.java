
import java.util.Scanner;

public class TheSumBetweenTwoNumbers
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerLim = Integer.parseInt(reader.nextLine());
        System.out.print("Seconds: ");
        int upperLim = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = lowerLim;
        while (count <= upperLim)
        {
            sum += count;
            count++;
        }
        System.out.println("The sum is " + sum);
    }
}
