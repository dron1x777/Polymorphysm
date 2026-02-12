public class Boat extends Vehicle {

    public Boat(String model, double speed) {
        super(model, speed);
    }

    @Override
    void move() {
        System.out.println(getModel() + " плывет");
    }

    @Override
    void stop() {
        System.out.println(getModel() + " бросает якорь");
    }
}
