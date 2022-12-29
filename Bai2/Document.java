package Bai2;

public class Document {
	private String document_id;
	private String document_author;
	private int quantity;
	public Document() {

		// TODO Auto-generated constructor stub
	}
	public Document(String document_id, String document_author, int quantity) {
		this.document_id = document_id;
		this.document_author = document_author;
		this.quantity = quantity;
	}
	public String getDocument_id() {
		return document_id;
	}
	public void setDocument_id(String document_id) {
		this.document_id = document_id;
	}
	public String getDocument_author() {
		return document_author;
	}
	public void setDocument_author(String document_author) {
		this.document_author = document_author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ID: " + document_id + "\nAuthor: " + document_author + "\nQuantity: "
				+ quantity + "\n";
	}
	
}
