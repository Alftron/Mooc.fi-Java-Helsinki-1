
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;
    }
    
    public void printLine() {
        Random random = new Random();
        for (int star = 0; star < this.width; star++) {
            double probability = random.nextDouble();
            if (probability <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        for (int line = 0; line < this.height; line++) {
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        int starsPrinted = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return starsPrinted;
    }
    
}
