import javax.swing.*;

public class Lab401 {

    // กำหนดตัวแปรแบบ global variable คือสามารถใช้ตัวแปรนี้ได้ในทุก method
    static String varEmail;

    // main() method
    public static void main(String[] args) {
        inputEmail();
    } // end of method main


    // inputEmail() method
    public static void inputEmail() {
        String ans = "";

        do {
            varEmail = JOptionPane.showInputDialog("Input your e-mail:");

            // ถ้ามีอีเมลที่รับมาไม่เป็นค่าว่าง ให้เรียกใช้ method checkEmailError (ขึ้นต้นด้วย @ หรือ space bar?)
            if (varEmail == null && !varEmail.isEmpty()) {
                checkEmailError(varEmail);
            } else {
                JOptionPane.showMessageDialog(null, "E-mail cannot be empty!");
            }
            ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
        } while (ans != null && ans.equalsIgnoreCase("y"));
    } // end of inputEmail method


    // checkEmailError() method
    public static void checkEmailError(String email) {
        while (email.startsWith("@") || email.contains(" ")) {
            email = JOptionPane.showInputDialog("Input your e-mail, again:");
        }

        email = email.toLowerCase();
        JOptionPane.showMessageDialog(null,
                checkEmail(email) ? "Your e-mail is " + email : "Your e-mail is not hotmail or gmail address.");
    } // end of checkEmailError method


    // checkEmail() method
    public static boolean checkEmail(String email) {

//        if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
//            return true;
//        } else {
//            return false;
//        }

        return email.endsWith("@gmail.com") || email.endsWith("@hotmail.com");
    } // end of checkEmail() method
}
