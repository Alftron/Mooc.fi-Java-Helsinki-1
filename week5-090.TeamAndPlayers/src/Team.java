/**
 *
 * @author martinh
 */
import java.util.ArrayList;


public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
        players = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player person) {
        if (players.size() < this.maxSize) {
            players.add(person);
        }
    }
    
    public void printPlayers() {
        for (Player person : players) {
            System.out.println(person.getName() + ", goals " + person.goals());
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int sum = 0;
        for (Player person : players) {
            sum += person.goals();
        }
        return sum;
    }
    
}
