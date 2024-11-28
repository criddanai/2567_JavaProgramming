import javax.swing.*;

public class Lab103 {
    public static void main(String[] args) {

        final double RATE_PER_HOUR = 50.0;
        final double RATE_PER_MINUTE = 0.25;
        int hoursOfParking, minutesOfParking;

        int inputMinuteParking = Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking (minute): "));
        hoursOfParking = inputMinuteParking / 60;
        minutesOfParking = inputMinuteParking % 60;
        double amountToPaid = (hoursOfParking * RATE_PER_HOUR) + (minutesOfParking * RATE_PER_MINUTE);
        JOptionPane.showMessageDialog(null, "You parking " + hoursOfParking + " Hour "
                    + minutesOfParking + " Minute.\n" + "Amount to be paid is " + amountToPaid + " bath.");

    }
}