import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats1 = new NumberStatistics();
        NumberStatistics stats2 = new NumberStatistics();
        NumberStatistics stats3 = new NumberStatistics();
        
        System.out.println("Type numbers:");
        while (true)
        {
            int input = Integer.parseInt(reader.nextLine());
            if (input != -1)
            {
                stats1.addNumber(input);
                if (input % 2 == 0)
                {
                    stats2.addNumber(input);
                }
                else
                {
                    stats3.addNumber(input);
                }
            }
            else
            {
                break;
            }
        }
        System.out.println("Sum: " + stats1.sum());
        System.out.println("Sum even: " + stats2.sum());
        System.out.println("Sum odd: " + stats3.sum());
    }
}
