package Lab02;
import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Book Title: ");
		String bookTitle = input.nextLine();
		System.out.print("Book Publish year: ");
		int publicYear = input.nextInt();

		FictionBook fictionBook = new FictionBook(bookTitle, publicYear);
		input.nextLine();
		System.out.print("Author name: ");
		String authorName = input.nextLine();
		System.out.print("Author email: ");
		String authorEmail = input.nextLine();
		fictionBook.setAuthorName(authorName);
		fictionBook.setEmail(authorEmail);

		while (!fictionBook.checkEmail()) {
			System.out.print("Author email, again: ");
			authorEmail = input.nextLine();
			fictionBook.setEmail(authorEmail);
		}
		System.out.println("===================================================");
		System.out.println(fictionBook);
	}
}
