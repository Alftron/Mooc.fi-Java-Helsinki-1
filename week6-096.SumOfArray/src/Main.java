
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int i = 0;
        int sum = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }
}
