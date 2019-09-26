import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int inputNum = Integer.parseInt(reader.nextLine());
        int count = 2;
        int factorial = 1;
        while (count <= inputNum)
        {
            factorial *= count++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
