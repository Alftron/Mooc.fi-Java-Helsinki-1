
import java.util.Scanner;

public class LowerLimitAndUpperLimit
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int lowerLim = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int upperLim = Integer.parseInt(reader.nextLine());
        
        if (lowerLim <= upperLim)
        {
            int count = lowerLim;
            while (count <= upperLim)
            {
                System.out.println(count);
                count++;
            }
        }
    }
}
