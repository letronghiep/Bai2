package Bai1;
import java.util.*;
public class CTQLCB{
	Scanner sc = new Scanner(System.in);
	private List<CanBo> officers;
	public CTQLCB() {
		this.officers = new ArrayList<>();
	}
	public void addStaff(CanBo officer) {
		// TODO Auto-generated method stub
		officers.add(officer);
	
	}

	public List<CanBo> searchStaff(String name) {
		List<CanBo> newStaff = new ArrayList<>();
		
		int n = officers.size();
		for(int i=0; i<n; i++) {
			if(officers.get(i).getHoten().equalsIgnoreCase(name)) {
				newStaff.add(officers.get(i));
			}
		}
//		newStaff.forEach(x -> {
//			System.out.println(x.toString());
//		});
		return newStaff;
	}

	public void displayStaff() {
		// TODO Auto-generated method stub
		if(officers.isEmpty()) {
			System.out.println("List Staff is not exist!");
		}else {
			System.out.println("List staff: \n");
			officers.forEach((x) -> {
				System.out.println(x.toString());
			});
		}
	}
	
}
