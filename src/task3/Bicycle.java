package task3;

public class Bicycle extends Transport{
    public Bicycle() {
        super(2);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is pedaling on the path with " + getWheels() + " wheels.");
    }
}
