public class Car extends Vehicle {
    private boolean isLuxury;

    public Car(String licensePlate, double baseRate, boolean isLuxury) {
        super(licensePlate, "Car", baseRate);
        this.isLuxury = isLuxury;
    }

    public double calculateRentalCost(int days) {
        double cost = super.calculateRentalCost(days);
        if (isLuxury) {
            cost = cost * 1.2;
        }
        return cost;
    }
}
