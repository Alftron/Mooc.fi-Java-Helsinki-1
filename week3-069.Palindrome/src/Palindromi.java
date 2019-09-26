import java.util.Scanner;

public class Palindromi
{

    public static boolean palindrome(String text)
    {
        String returnVal = "";
        int i = text.length() - 1;
        while (i >= 0)
        {
            returnVal += text.charAt(i);
            i--;
        }
        return returnVal.equals(text);
    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text))
        {
            System.out.println("The text is a palindrome!");
        }
        else 
        {
            System.out.println("The text is not a palindrome!");
        }
    }
}
