package task3;

public abstract class Transport {
    private int wheels;

    public Transport(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public abstract void move();
}
