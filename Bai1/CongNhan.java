package Bai1;

public class CongNhan extends CanBo{
	private int bac;

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String hoten, int tuoi, String gioitinh, String diachi) {
		super(hoten, tuoi, gioitinh, diachi);
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String hoten, int tuoi, String gioitinh, String diachi, int bac) {
		super(hoten, tuoi, gioitinh, diachi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "worker:{\n" + super.toString() +  "\nLevel: " + bac + "\n}";
	}
	
}
