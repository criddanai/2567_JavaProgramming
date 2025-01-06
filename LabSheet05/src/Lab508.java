import javax.swing.*;

public class Lab508 {

    public static void main(String[] args) {
        int[] nums = { 25, 78, 41, 22, 36, 85, 37 };

        int data = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));

        while (!checkIndex(nums, data)) {
            data = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
        }

        int currentData = currentData(nums, data);
            JOptionPane.showMessageDialog(null,
                    "Current data, nums[" + data + "] is " + currentData
                            + "\n" + (data != 0 ? "Previous data, nums[" + (data - 1) + "] is " + prevData(nums, data) : "No previous data")
                            + "\n" + (data != nums.length ? "Next data, nums[" + (data + 1) + "] is " + nextData(nums, data) : "No next data"));

    } // end of main() method

    public static boolean checkIndex(int[] nums, int index) {
        return (index >= nums.length ? false : true);
    } // end of checkIndex() method

    public static int currentData(int[] nums, int index) {
        return nums[index];
    } // end of currentData() method

    public static int prevData(int[] nums, int index) {
        return nums[index - 1];
    } // end of prevData() method

    public static int nextData(int[] nums, int index) {
        return nums[index + 1];
    } // end of nextData() method
}
