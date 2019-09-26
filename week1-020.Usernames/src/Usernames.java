
import java.util.Scanner;

public class Usernames
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String user2 = "emily";
        String pass1 = "mightyducks";
        String pass2 = "cat";
        
        System.out.print("Type your username:" );
        String typedUser = reader.nextLine();
        
        System.out.print("Type your password:" );
        String typedPass = reader.nextLine();
        
        if (typedUser.equals(user1) && typedPass.equals(pass1) ||
            typedUser.equals(user2) && typedPass.equals(pass2))
        {
            System.out.println("You are now logged into the system!");
        }
        else
        {
            System.out.println("Your username or password was invalid!");
        }
    }
}
