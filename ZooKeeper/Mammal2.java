public class Mammal2{
    protected int energyLevel;

    public Mammal2(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int displayEnergy(){
        System.out.println("The Mammal2's Energy Level is " + this.energyLevel);
        return this.energyLevel;
    }
}