public class Reformatory {
    private int totalWeightsMeasured = 0;
    
    public int weight(Person person) {
        // increase the weight measure count
        this.totalWeightsMeasured++;
        // return the weight of the person
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured;
    }

}
