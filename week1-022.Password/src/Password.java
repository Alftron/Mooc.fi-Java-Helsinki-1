
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String typedPass = "";
        
        while (!typedPass.equals(password))
        {
            System.out.print("Type the password: ");
            typedPass = reader.nextLine();
            if (!typedPass.equals(password))
            {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Right!");
        System.out.println("The secret is: blahblah");
    }
}
