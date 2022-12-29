package Bai1;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CTQLCB officers = new CTQLCB();
		KySu en = new KySu("Hiep", 19, "Nam", "Ninh Binh", "developer");
		CongNhan staff1 = new CongNhan("Hieu", 20, "Nam", "Thanh Hoa", 4);
		NhanVien n1 = new NhanVien("Linh", 20, "Nam", "Thanh Hoa", "Thu ngan");
		officers.addStaff(en);
		officers.addStaff(staff1);
		officers.addStaff(n1);
		int choose;
		System.out.println("---------Menu---------");
		do {
			System.out.println("1 - Add Staff");
			System.out.println("2 - Search Staff");
			System.out.println("3 - Display List Staff");
			System.out.println("4 - Exit Program");
			System.out.println("Enter your choose: \n");
			choose = sc.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("---------Add Staff-----------");
				System.out.println("Enter a: to insert Enginner");
                System.out.println("Enter b: to insert Worker");
                System.out.println("Enter c: to insert Staff");
                System.out.println("Enter type: ");
                sc.nextLine();
                String type = sc.nextLine();
                switch (type) {
				case "a":
					System.out.println("Name: ");
					String name = sc.nextLine();
					System.out.println("Age: ");
					int age = sc.nextInt();
					System.out.println("Gender: ");
					sc.nextLine();
					String gender = sc.nextLine();
					System.out.println("Address: ");
					String address = sc.nextLine();
					System.out.println("Branch: ");
					String branch = sc.nextLine();
					KySu engineer = new KySu(name, age, gender, address, branch);
					officers.addStaff(engineer);
					break;
				case "b": 
					System.out.println("Name: ");
					String nameWorker = sc.nextLine();
					System.out.println("Age: ");
					int ageWorker = sc.nextInt();
					System.out.println("Gender: ");
					sc.nextLine();
					String genderWorker = sc.nextLine();
					System.out.println("Address: ");
					String addressWorker = sc.nextLine();
					System.out.println("Branch: ");
					int levelWorker = sc.nextInt();
					CongNhan Worker = new CongNhan(nameWorker, ageWorker, genderWorker, addressWorker, levelWorker);
					officers.addStaff(Worker);
					break;
				case "c": 
					System.out.println("Name: ");
					String nameStaff = sc.nextLine();
					System.out.println("Age: ");
					int ageStaff = sc.nextInt();
					System.out.println("Gender: ");
					sc.nextLine();
					String genderStaff = sc.nextLine();
					System.out.println("Address: ");
					String addressStaff = sc.nextLine();
					System.out.println("Task: ");
					String task = sc.nextLine();
					NhanVien staff = new NhanVien(nameStaff, ageStaff, genderStaff, addressStaff, task);
					officers.addStaff(staff);
					break;
				default:
					continue;
				}
				
				break;
				
			}
			case 2: 
				System.out.println("---------Search Name-----------");
				System.out.println("Input name search: ");
				sc.nextLine();
				String name = sc.nextLine();
				officers.searchStaff(name).forEach(x -> {
					System.out.println(x.toString());
				});

				break;
			case 3:
				officers.displayStaff();
				break;

			default:
				break;
			}
		} while (choose >= 1 || choose <= 4);
	}

}
