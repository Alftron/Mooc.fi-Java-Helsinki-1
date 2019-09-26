public class PrintingLikeBoss
{
    public static void printStars(int amount)
    {
        int count = 1;
        while (count <= amount)
        {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }
    
    public static void printWhitespaces(int amount)
    {
        int count = 1;
        while (count <= amount)
        {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size)
    {
        int count = 1;
        int linesRemaining = size;
        while (count <= size)
        {
            printWhitespaces(linesRemaining - 1);
            printStars(count);
            count++;
            linesRemaining--;
        }
    }

    public static void xmasTree(int height)
    {
        // Triangle section of the tree
        int linesRemaining = height;
        for (int i = 0; i < height; i++)
        {
            printWhitespaces(linesRemaining - 1);
            printStars((2 * i) + 1);
            linesRemaining--;
        }
        
        // Rectangle/stand section of the tree
        int stumpHeight = 2;
        for (int i = 0; i < stumpHeight; i++)
        {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args)
    {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
