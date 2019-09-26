import java.util.ArrayList;

public class Grade {
    ArrayList<Integer> scores;
    private int[] distribution;
    
    
    public Grade() {
        scores = new ArrayList<Integer>();
        distribution = new int[6];
    }
    
    public void add(int num) {
        // Adds the grade score
        if (num >= 0 && num <= 60) {
            this.scores.add(num);
        }
    }
    
    public void calculateGrades() {
        for (int grade : scores) {
            if (grade >= 0 && grade <= 29) {
                distribution[0] += 1;
            } else if (grade >= 30 && grade <= 34) {
                distribution[1] += 1;
            } else if (grade >= 35 && grade <= 39) {
                distribution[2] += 1;
            } else if (grade >= 40 && grade <= 44) {
                distribution[3] += 1;
            } else if (grade >= 45 && grade <= 49) {
                distribution[4] += 1;
            } else if (grade >= 50 && grade <= 60) {
                distribution[5] += 1;
            }
        }
    }
    
    public void printDistribution() {
        // Prints the formatted distribution of scores
        System.out.println("Grade distribution:");
        
        for (int i = distribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int x = 0; x < distribution[i]; x++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void printPercentage() {
        // Prints the percentage
        int accepted = 0;
        int allScores = scores.size();
        double percentage = 0;
        
        for (int i = 1; i < distribution.length; i++) {
            accepted += distribution[i];
        }
        
        if (accepted == 0) {
            percentage = 0;
        } else {
            percentage = ((100 *accepted) / allScores);
        }
        System.out.println("Acceptance percentage: " + percentage);
    }
}
