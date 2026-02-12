public class TrafficController {

    void startJourney(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.showInfo();
        }
    }
    void stopAll(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }
    }
    void testVehicle(Vehicle vehicle) {
        vehicle.showInfo();
        vehicle.move();
        vehicle.stop();
    }
}
