import java.util.ArrayList;

public class Variance
{
    public static int sum(ArrayList<Integer> list)
    {
        int sum = 0;
        for (int num : list)
        {
            sum += num;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list)
    {
        return (double)sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list)
    {
        double average = average(list);
        double tempSum = 0;
        for (int x : list)
        {
            tempSum += Math.pow((x - average), 2);
        }
        return tempSum / (list.size() - 1);
    }
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
