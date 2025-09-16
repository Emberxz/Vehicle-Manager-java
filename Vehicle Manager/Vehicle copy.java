public class Vehicle {
    protected String licensePlate;
    protected String type;
    protected double baseRate;

    public Vehicle(String licensePlate, String type, double baseRate) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.baseRate = baseRate;
    }

    public double calculateRentalCost(int days) {
        return baseRate * days;
    }
}

