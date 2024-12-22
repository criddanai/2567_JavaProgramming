import java.util.*;

public class Lab404 {

    static Scanner scan = new Scanner(System.in);
    static String id, subject_Id;
    static int sub_Id;
    static boolean stu_IT, sub_IT;

    public static void main(String[] args) {
        inputStudent();
    } // end of main() method

    public static void inputStudent() {
        do {
            System.out.print("Enter Student Id: ");
            id = scan.next();
            System.out.print("Enter Subject Id: ");
            sub_Id = scan.nextInt();
            subject_Id = sub_Id + ""; // convert sub_Id to String
        } while (!isLength(id, subject_Id));
        System.out.println();
        displayData(isITStudent(id), isITSubject(subject_Id));
    } // end of inputStudent() method

    public static boolean isLength(String id, String subject_Id) {
        if (id.length() == 10 && subject_Id.length() == 7) {
            return true;
        } else {
            return false;
        }
    } // end of isLength() method

    public static boolean isITStudent(String id) {
        if (id.substring(0, 3).equals("211") && id.substring(3, 6).equals("311")) {
            return true;
        } else if (id.substring(0, 3) != "211" && id.substring(3, 6) != "311"){
            return false;
        }
        return true;
    } // end of isITStudent() method

    public static boolean isITSubject(String subject_Id) {
        if (subject_Id.substring(0, 2).equals("21") && subject_Id.substring(4, 5).equals("1")) {
            return true;
        } else {
            return false;
        }
    } // end of isITSubject() method

    public static void displayData(boolean stu_IT, boolean sub_IT) {
        if (stu_IT) {
            System.out.println("Student id: " + id + " 1st year student in IT and ");
        } else {
            System.out.println("Student id: " + id + " is not 1st year student in IT ");
        }

        if (sub_IT) {
            System.out.println("Enroll in courses for Year 1");
        } else {
            System.out.println("not enroll in courses for Year 1");
        }
    } // end of displayData() method
}
