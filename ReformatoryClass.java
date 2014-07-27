public class Reformatory {
    private int counterWeightsMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.counterWeightsMeasured++;
        return person.getWeight();     
    }
    
    public void feed(Person person){
        int increment = person.getWeight() + 1;
        person.setWeight(increment);
    }
    
    public int totalWeightsMeasured(){
        return this.counterWeightsMeasured;
    }

}
