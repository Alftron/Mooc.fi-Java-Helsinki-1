import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        Database birdDB = new Database();
        boolean running = true;
        while (running) {
            System.out.print("? ");
            String command = reader.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latin = reader.nextLine();
                if (!name.isEmpty() && !latin.isEmpty()) {
                    birdDB.add(new Bird(name, latin));
                }
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observed = reader.nextLine();
                if (!birdDB.observation(observed)) {
                    System.out.println("Is not a bird!");
                }
            } else if (command.equals("Statistics")) {
                birdDB.statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                String bird = reader.nextLine();
                birdDB.show(bird);
            } else if (command.equals("Quit")) {
                running = birdDB.quit();
            }
        }
    }

}
