package Lab06;

import java.util.Scanner;

public class TestUtilityBillCalculatorInput {
    public static void main(String[] args) {
        UtilityBillCalculator billCalculator = new UtilityBillCalculator();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter electricity usage (units): ");
        double electricityUsage = input.nextDouble();

        System.out.print("Enter water usage (units): ");
        double waterUsage = input.nextDouble();

        billCalculator.setUsage(electricityUsage, waterUsage);
        billCalculator.displayBillDetails();

        input.close();
    }
}
