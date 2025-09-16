public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, double baseRate, double loadCapacity) {
        super(licensePlate, "Truck", baseRate);
        this.loadCapacity = loadCapacity;
    }

    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (loadCapacity > 5.0) {
            double temp = 0.0;
            temp = 1.15 * cost; 
            cost = temp; 
        }
        return cost;
    }
}

