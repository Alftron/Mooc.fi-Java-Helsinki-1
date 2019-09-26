import java.util.Scanner;

public class LoopsEndingRemembering
{
    public static void main(String[] args)
    {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int input = 0;
        int sum = 0;
        int count = 0;
        int totalEven = 0;
        int totalOdd = 0;
        while (true)
        {
            input = Integer.parseInt(reader.nextLine());
            System.out.println(input);
            if (input == -1)
            {
                break;
            }
            count++;
            sum += input;
            if (input % 2 == 0)
            {
                totalEven++;
            }
            else
            {
                totalOdd++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + ((double)sum / count));
        System.out.println("Even numbers: " + totalEven);
        System.out.println("Odd numbers: " + totalOdd);
    }
}
