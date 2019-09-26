


/**
 *
 * @author martinh
 */
public class Player {
    private String playerName;
    private int goals;
    
    public Player(String name) {
        this(name, 0);
    }
    
    public Player(String name, int goals) {
        this.playerName = name;
        this.goals = goals;
    }
    
    public String getName() {
        return this.playerName;
    }
    
    public int goals() {
        return this.goals;
    }
    
    public String toString() {
        return this.getName() + ", goals " + this.goals();
    }
    
}
