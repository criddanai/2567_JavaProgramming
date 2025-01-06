import java.util.*;

public class Lab504 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] score = new double[5];
        double avg = 0;
        int index = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Input score of student " + (i + 1) + " : ");
            score[i] = input.nextDouble();
            avg += score[i];
        }
        System.out.println();
        avg /= score.length;
        System.out.printf("Average of %s student is %.2f%n", score.length, avg);

        for (double _score : score) {
            index++;

            if (_score > avg) {
                System.out.printf("> Student %s (%.2f)%n", index, _score);
            }
        }

        input.close();
    }
}
