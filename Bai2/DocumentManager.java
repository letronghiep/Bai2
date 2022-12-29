package Bai2;
import java.util.*;
public class DocumentManager {
	 private List<Document> documents;
	Scanner sc = new Scanner(System.in);
	public DocumentManager() {
		this.documents = new ArrayList<>();
	}
	public boolean addDocument(Document document) {
		int n = documents.size();
		boolean check = false;
		for(int i=0; i<n; i++) {
			if(document.getDocument_id().equalsIgnoreCase(documents.get(i).getDocument_id())) {
				check = true;
			}
			
		}
		if(check) {
			System.out.println("ID is exist");
		}else {
			documents.add(document);
		}
		return check;
	}
	public boolean deleteDocument() {
		System.out.println("Enter id you want delete: ");
		String id = sc.nextLine();
		boolean check = false;
//		System.out.println("Enter id you want delete: ");
//		String idCheck = sc.nextLine();
		int n = documents.size();
		for(int i=0; i<n; i++) {
			if(documents.get(i).getDocument_id().equalsIgnoreCase(id)) {
				check = true;
				documents.remove(i);
				break;
			}
		}
		if(check) {
			System.out.println("Delete complete!");
		}else {
			System.out.println("Id is not exists!");
			
		}
		return check;
	}
	public void displayDocument() {
		if(documents.isEmpty()) {
			System.out.println("Document is not exist!");
		}else {
			System.out.println("List document: \n");
			documents.forEach(x-> {
				System.out.println(x.toString());
			});
		}
	}
	public void searchDocument(String type) {
		if(type.equalsIgnoreCase("Book")) {
			this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
		}else if(type.equalsIgnoreCase("Journal")) {
			this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
			
		}else if(type.equalsIgnoreCase("NewPapers")) {
			this.documents.stream().filter(doc -> doc instanceof NewPapers).forEach(doc -> System.out.println(doc.toString()));
		}
	}
//	public void searchBook(){
//		this.documents.
//		
//	}
}
