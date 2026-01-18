class Book{
	String title;
	String author;
	int year;

	Book(String title, String author, int year){
	this.title = title;
	this.author = author;
	this.year = year;
	}

	void display(){
	System.out.println("\nBook Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Published Year: " + year);
}
}

public class Practice8{
	public static void main(String [] args){
	Book mybook = new Book("Jungle Book", "Vallirie Turbanos", 2025);
	mybook.Display();

}

}
