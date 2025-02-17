package Lab04;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input movie id    : ");
        String id = scan.next();
        scan.nextLine();
        System.out.print("Input movie name  : ");
        String name = scan.nextLine();

        System.out.println();

        System.out.print("Input director name   : ");
        String directorName = scan.nextLine();
        System.out.print("Input director e-mail : ");
        String email = scan.next();
        System.out.print("Input director gender : ");
        char gender = scan.next().charAt(0);

        while (Character.toUpperCase(gender) != 'M' && Character.toUpperCase(gender) != 'F') {
            System.out.print("Input director gender, again : ");
            gender = scan.next().charAt(0);
        }

        System.out.println();

        System.out.print("Input movie theater   : ");
        int theaterNo = scan.nextInt();
        while (theaterNo < 1 || theaterNo > 15) {
            System.out.print("Please input 1 - 15 only : ");
            theaterNo = scan.nextInt();
        }

        System.out.println();

        Theater theater = new Theater(id, name, new Director(directorName, email, gender), theaterNo);
        System.out.println(theater);

    }
}