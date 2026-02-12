public class Plane extends Vehicle {

    public Plane(String model, double speed) {
        super(model, speed);
    }

    @Override
    void move() {
        System.out.println(getModel() + " летит");
    }

    @Override
    void stop() {
        System.out.println(getModel() + " тормозит по шосси");
    }
}
