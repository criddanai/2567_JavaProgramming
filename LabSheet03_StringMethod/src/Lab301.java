import java.util.*;

public class Lab301 {

	public static void main(String[] args) {
		
		Scanner keybord = new Scanner(System.in);
		
		// กำหนดตัวแปล text สำหรับรวมข้อความที่ป้อนทาง console
		String text = "";
		// กำหนดตัวแปร word สำหรับรับข้อมูลทาง console
		String word;
		
		while(true) {
			System.out.print("Enter word: ");
			word = keybord.next();
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Your terminate program...");
				break;
			}
			text = text + word + " "; // text += word + " ";
		} // end of while
		
		System.out.println(text.toUpperCase());
		
		keybord.close();
	}

}
