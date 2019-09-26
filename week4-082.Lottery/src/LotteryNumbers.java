import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        random = new Random();
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        this.numbers.clear();
        int count = 0;
        while (count < 7) {
            int num = random.nextInt(39) + 1;
            while (containsNumber(num)) {
                num = random.nextInt(39) + 1;
            }
            this.numbers.add(num);
            count++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        return this.numbers.contains(number);
    }
}
