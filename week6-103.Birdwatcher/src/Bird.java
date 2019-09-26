
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latinName = latin;
        this.observations = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latinName;
    }
    
    public int getObservations() {
        return this.observations;
    }
    
    public void addObservation() {
        this.observations++;
    }
}
