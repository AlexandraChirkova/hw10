package task3;

public class Car extends Transport{

    public Car() {
        super(4);
    }

    @Override
    public void move() {
        System.out.println("Car is driving on the road with " + getWheels() + " wheels.");
    }
}
