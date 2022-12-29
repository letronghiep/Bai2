package Bai1;

public class NhanVien extends CanBo{
	private String congviec;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoten, int tuoi, String gioitinh, String diachi) {
		super(hoten, tuoi, gioitinh, diachi);
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoten, int tuoi, String gioitinh, String diachi, String congviec) {
		super(hoten, tuoi, gioitinh, diachi);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}

	@Override
	public String toString() {
		return "Staff: {\n" + super.toString() + "\nTask: " + congviec + "\n}";
	}
	
}
