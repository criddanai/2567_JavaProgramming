package Lab07;

public class BMICalculator {
    private double weight;
    private double height;

    public void setDetails(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getBMICategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public void displayBMIDetails() {
        double bmi = calculateBMI();
        String category = getBMICategory();

        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Category: " + category);
    }

}
