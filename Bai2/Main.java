package Bai2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DocumentManager docs = new DocumentManager();
		Book b1 = new Book("1", "Hiep Le", 12, "Hiep", 123);
		Journal jou1 = new Journal("2", "Huyen", 123, 12, 1);
		NewPapers paper1 = new NewPapers("3", "Hue", 123, 2);
		docs.addDocument(b1);
		docs.addDocument(jou1);
		docs.addDocument(paper1);
		int choose;
			do {
				System.out.println("---------------Menu Select---------------");
				System.out.println("1 - Add Document");
				System.out.println("2 - Delete Document");
				System.out.println("3 - Display Document");
				System.out.println("4 - Search Document");
				System.out.println("5 - Exit!");
				System.out.println("Enter your choose: ");
//				sc.nextLine();
				choose = scanner.nextInt();
				switch (choose) {
				case 1:
					System.out.println("-------------Add Document------------");
					System.out.println("a - Add book");
					System.out.println("b - Add Journal");
					System.out.println("c - Add Paper");
					System.out.println("Enter your type: ");
					scanner.nextLine();
					String type = scanner.nextLine();
					
					switch (type) {
					 case "a": {
                         System.out.print("Enter ID: ");
                         String id = scanner.nextLine();
                         System.out.print("Enter nxb:");
                         String nxb = scanner.nextLine();
                         System.out.print("Enter number: ");
                         int number = scanner.nextInt();
                         System.out.print("Enter author: ");
                         scanner.nextLine();
                         String author = scanner.nextLine();
                         System.out.print("Enter page number: ");
                         int pageNumber = scanner.nextInt();
                         Document book = new Book(id, nxb, number, author, pageNumber);
                         docs.addDocument(book);
//                         System.out.println(book.toString());
                         scanner.nextLine();
                         break;

                     }
                     case "b": {
                         System.out.print("Enter ID: ");
                         String id = scanner.nextLine();
                         System.out.print("Enter nxb:");
                         String nxb = scanner.nextLine();
                         System.out.print("Enter number: ");
                         int number = scanner.nextInt();
                         System.out.print("Enter Day issue: ");
                         int dayIssue = scanner.nextInt();
                         Document newspaper = new NewPapers(id, nxb, number, dayIssue);
                         docs.addDocument(newspaper);
//                         System.out.println(newspaper.toString());
                         scanner.nextLine();
                         break;
                     }
                     case "c": {
                         System.out.print("Enter ID: ");
                         String id = scanner.nextLine();
                         System.out.print("Enter nxb:");
                         String nxb = scanner.nextLine();
                         System.out.print("Enter number: ");
                         int number = scanner.nextInt();
                         System.out.print("Enter issue number : ");
                         int issueNumber = scanner.nextInt();
                         System.out.print("Enter issue month : ");
                         int issueMonth = scanner.nextInt();
                         Document journal = new Journal(id, nxb, number, issueNumber, issueMonth);
                         docs.addDocument(journal);
//                         System.out.println(journal.toString());
                         scanner.nextLine();
                         break;
                     }
                     }
					break;
				case 2: 
					
					docs.deleteDocument();
//					docs.displayDocument();
					break;
				case 3:
					docs.displayDocument();
					break;
				case 4:
					System.out.println("Enter type search: ");
					scanner.nextLine();
					String typeSearch = scanner.nextLine();
					docs.searchDocument(typeSearch);
					
					break;
				default:
					break;
				}
				
				
				
				
				
				
				
			if(choose < 1 || choose > 5) {
				System.out.println("Data input wrong! Please enter your choose again");
			}
			} while (choose >=1 || choose <= 5);
			
		
		
	}
}
