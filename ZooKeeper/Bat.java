public class Bat extends Mammal2{

    public Bat(int energyLevel){
        super(energyLevel);
    }
    public void fly(){
        System.out.println("The Bat has made a taking off sound");
        this.energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("So- will, never mind");
        this.energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("It sounds the town is on fire");
        this.energyLevel -= 100;
    }
}