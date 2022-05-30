package quanLySach;

public class TacGia {
	private String tenTacGia;
	private Ngay ngaySinh;
	// tao 1 constructor
	public TacGia (String tentacgia , Ngay ngaysinh) {
		this.tenTacGia = tentacgia;
		this.ngaySinh = ngaysinh;
	}
	// tao ham set de thay doi gia tri
	public void setTenTacGia(String ten) {
		this.tenTacGia = ten;
	}
	public void ngaySinh(Ngay ngay) {
		this.ngaySinh = ngay;
	}
	// ham get 
	public String getTenTacGia() {
		return this.tenTacGia;
	}
	public Ngay getNgaySinh() {
		return this.ngaySinh;
	}
}
