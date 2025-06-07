package week2.day1;

public class Library {

	
	public String addBook(String title)
	{
		return title;
	}
	void addBook()
	{
		System.out.println("Book:2 "+"Artificail Intelligence");
	}
	void launchBook()
	{
		System.out.println("Books Launched successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		System.out.println("Book:1 "+lib.addBook("Environmental Science"));
		lib.addBook();
		lib.launchBook();		

	}

}
