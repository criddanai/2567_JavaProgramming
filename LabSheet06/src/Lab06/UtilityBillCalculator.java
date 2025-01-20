package Lab06;

public class UtilityBillCalculator {
    private double electricityUsage;
    private double waterUsage;

    public void setUsage(double electricityUsage, double waterUsage) {
        this.electricityUsage = electricityUsage;
        this.waterUsage = waterUsage;
    }

    public double calculateElectricityBill() {
        double bill = 0.0;

        if (electricityUsage <= 50) {
            bill = electricityUsage * 1.50;
        } else if (electricityUsage <= 150) {
            bill = (50 * 1.50) + ((electricityUsage - 50) * 2.50);
        } else {
            bill = (50 * 1.50) + (100 * 2.50) + ((electricityUsage - 150) * 3.0);
        }
        return bill;
    }

    public double calculateWaterBill() {
        double bill = 0.0;

        if (waterUsage <= 30) {
            bill = waterUsage * 10;
        } else {
            bill = (30 * 10) + ((waterUsage - 30) * 15);
        }
        return bill;
    }

    public void displayBillDetails() {
        double electricityBill = calculateElectricityBill();
        double waterBill = calculateWaterBill();

        System.out.println("Electricity Usage: " + electricityUsage + " units");
        System.out.println("Electricity Bill: " + electricityBill + " THB");
        System.out.println("Water Usage: " + waterUsage + " units");
        System.out.println("Water Bill: " + waterBill + " THB");
        System.out.println("Total Bill: " + (electricityBill + waterBill) + " THB");
    }

}
