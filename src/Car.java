public class Car extends Vehicle {

    public Car(String model, double speed) {
        super(model, speed);
    }

    @Override
    void move() {
        System.out.println(getModel() + " едет по дророге");
    }

    @Override
    void stop() {
        System.out.println(getModel() + " тормозит колесами");
    }
}
