package Bai1;

public class KySu extends CanBo{
	private String nganhDT;

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String hoten, int tuoi, String gioitinh, String diachi) {
		super(hoten, tuoi, gioitinh, diachi);
		// TODO Auto-generated constructor stub
	}

	public KySu(String hoten, int tuoi, String gioitinh, String diachi, String nganhDT) {
		super(hoten, tuoi, gioitinh, diachi);
		this.nganhDT = nganhDT;
	}

	public String getNganhDT() {
		return nganhDT;
	}

	public void setNganhDT(String nganhDT) {
		this.nganhDT = nganhDT;
	}

	@Override
	public String toString() {
		return "Engineer: {\n" + super.toString() + "\nBranch: " + nganhDT + "\n}";
	}
	
}
