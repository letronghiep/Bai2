package Bai2;

public class NewPapers extends Document{
	public int dayIssue;

	public NewPapers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewPapers(String document_id, String document_author, int quantity) {
		super(document_id, document_author, quantity);
		// TODO Auto-generated constructor stub
	}

	public NewPapers(String document_id, String document_author, int quantity, int dayIssue) {
		super(document_id, document_author, quantity);
		this.dayIssue = dayIssue;
	}

	public int getDayIssue() {
		return dayIssue;
	}

	public void setDayIssue(int dayIssue) {
		this.dayIssue = dayIssue;
	}

	@Override
	public String toString() {
		return "NewPapers:  " + super.toString() + "\ndayIssue: " + dayIssue + "\n";
	}
	
}
