public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String licensePlate, double baseRate, boolean hasSidecar) {
        super(licensePlate, "Motorcycle", baseRate);
        this.hasSidecar = hasSidecar;
    }

    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (hasSidecar) {
            cost += 10 * days;
        }
        return cost;
    }
}

