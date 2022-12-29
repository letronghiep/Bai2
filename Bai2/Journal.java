package Bai2;

public class Journal extends Document{
	private int issueNumber;
    private int monthIssue;
	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Journal(String document_id, String document_author, int quantity) {
		super(document_id, document_author, quantity);
		// TODO Auto-generated constructor stub
	}
	public Journal(String document_id, String document_author, int quantity, int issueNumber, int monthIssue) {
		super(document_id, document_author, quantity);
		this.issueNumber = issueNumber;
		this.monthIssue = monthIssue;
	}
	public int getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}
	public int getMonthIssue() {
		return monthIssue;
	}
	public void setMonthIssue(int monthIssue) {
		this.monthIssue = monthIssue;
	}
	@Override
	public String toString() {
		return "Journal: " + super.toString() +  "\nissueNumber: " + issueNumber + "\nmonthIssue: " + monthIssue + "\n";
	}
    
}
