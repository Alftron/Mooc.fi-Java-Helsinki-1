
public class EvenNumbers
{
    public static void main(String[] args)
    {
        int count = 2;
        while (count <= 100)
        {
            if (count % 2 == 0)
            {
                System.out.println(count);
            }
            count++;
        }
    }
}
