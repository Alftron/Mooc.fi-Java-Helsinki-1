import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade records = new Grade();
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input != -1) {
                records.add(input);
            } else {
                break;
            }
        }
        records.calculateGrades();
        records.printDistribution();
        records.printPercentage();
    }
}
