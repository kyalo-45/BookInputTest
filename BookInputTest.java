package book;

import java.util.Scanner;

public class Book {
    String title;
    String authour;
    int numberofpages;
}

public class BookInputTest {

    public static void main(String[] args) {
	Book bk = new Book();
	Scanner input = new Scanner(System.in);
	String x, y;
	int a;
	System.out.println("Please enter the title of the book");
	x = input.nextLine();
	System.out.println("Please enter the author name");
	y = input.nextLine();
	System.out.println("Please enter the number of page");
	a = input.nextInt();
	bk.title = "" + x;
	bk.authour = "" + y;
	bk.numberofpages = +a;

	System.out.println("The book title is:" + bk.title);
	System.out.println("The book author is:" + bk.authour);
	System.out.println("The book has " + bk.numberofpages + " pages");
    }

}