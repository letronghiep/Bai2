package Bai2;

public class Book extends  Document{
	private String author_name;
	private int pages;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String document_id, String document_author, int quantity) {
		super(document_id, document_author, quantity);
		// TODO Auto-generated constructor stub
	}
	public Book(String document_id, String document_author, int quantity, String author_name, int pages) {
		super(document_id, document_author, quantity);
		this.author_name = author_name;
		this.pages = pages;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book: " + super.toString() +  "\nauthor name: " + author_name + "\npages: " + pages + "\n";
	}
	
}
