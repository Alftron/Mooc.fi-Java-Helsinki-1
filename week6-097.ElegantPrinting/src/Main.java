
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
