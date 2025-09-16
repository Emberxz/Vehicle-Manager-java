public class VehicleManager {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", 100, true);
        Vehicle truck = new Truck("XYZ456",150, 6);
        Vehicle motorcycle = new Motorcycle("MNO789", 70, true);

        System.out.println("Vehicle: " + car.type + " | License Plate: " + car.licensePlate);
        System.out.println("Rental Cost for 3 days: $" + car.calculateRentalCost(3) + "\n");


        System.out.println("Vehicle: " + truck.type + " | License Plate: " + truck.licensePlate);
        System.out.println("Rental Cost for 3 days: $" + truck.calculateRentalCost(3)+ "\n");

        System.out.println("Vehicle: " + motorcycle.type + " | License Plate: " + motorcycle.licensePlate);
        System.out.println("Rental Cost for 3 days: $" + motorcycle.calculateRentalCost(3)+ "\n");
    }
}
