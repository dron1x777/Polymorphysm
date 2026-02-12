public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Plane("planer", 700.5),
                new Car("LEXUS", 250),
                new Boat("SUBMARINE", 74.3),
        };
        TrafficController trafficController = new TrafficController();
        trafficController.startJourney(vehicles);
        trafficController.stopAll(vehicles);
        trafficController.testVehicle(vehicles[1]);
    }
}