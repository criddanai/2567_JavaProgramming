import javax.swing.JOptionPane;

public class Lab506 {
    public static void main(String[] args) {

        String[] words = { "Good Morning", "Good Afternoon", "Good Evening", "Good Night" };
        String text = "The Greeting words in English:"; // เก็บข้อความไว้ในตัวแปล และนำไปใช้กับ class JOptionPane

        for (String word : words) {
            text += "\n- " + word;
        }
        JOptionPane.showMessageDialog(null, text);
    }
}
