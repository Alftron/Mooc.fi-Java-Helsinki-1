import java.util.ArrayList;

public class Database {
    ArrayList<Bird> birds;
    
    public Database() {
        birds = new ArrayList<Bird>();
    }
    
    public void add(Bird birdToAdd) {
        // Adds a bird
        birds.add(birdToAdd);
    }
    
    public boolean observation(String observed) {
        // Adds an observation
        for (Bird bird : birds) {
            if (bird.getName().equals(observed)) {
                bird.addObservation();
                return true;
            }
        }
        return false;
    }
    
    public void statistics() {
        // Prints all birds
        for (Bird bird : birds) {
            System.out.println(bird.getName() + " (" + bird.getLatin() + ") " +
                                ": " + bird.getObservations() + " observations");
        }
    }
    
    public void show(String toShow) {
        // Print one bird
        for (Bird bird : birds) {
            if (bird.getName().equals(toShow)) {
                System.out.println(bird.getName() + " (" + bird.getLatin() + ") " +
                                    ": " + bird.getObservations() + " observations");
            }
        }
    }
    
    public boolean quit() {
        // Terminates the program
        return false;
    }
    
}
