package week1.day2;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle + ": Book added successfully");
		return bookTitle;
	}
	
	public static void issueBook() {
		
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library book1 = new Library();
		book1.addBook("Harry Potter");
		book1.issueBook();

	}

}
