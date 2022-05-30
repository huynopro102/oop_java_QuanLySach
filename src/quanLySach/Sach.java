package quanLySach;

public class Sach {
	private String tenSach;
	private double giaSach;
	private int namXuatBan;
	private TacGia tacGia;
	// ham constructor
	public Sach(String ten , double gia , int namxuatban , TacGia tg) {
		this.tenSach = ten;
		this.giaSach = gia;
		this.namXuatBan = namxuatban;
		this.tacGia = tg;
	}
	// ham set de thay doi gia tri cua object
	public void setTenSach(String ten) {
		this.tenSach = ten;
	}
	public void setGiaSach(double gia) {
		this.giaSach = gia;
	}
	public void setNamXuatBan(double namxuatban) {
		this.namXuatBan = namxuatban;
	}
	public void setTacGia(TacGia tg) {
		this.tacGia = tg;
	}
	// ham get de lay dc gia tri cua object
	public String getTenSach() {
		return this.tenSach;
	}
	public double getGiaSach() {
		return this.giaSach;
	}
	public int getNamXuatBan() {
		return this.namXuatBan;
	}
	public TacGia getTacGia() {
		return this.tacGia;
	}
	// in ten sach
	public String inTenSach() {
		return this.tenSach;
	}
	// kiem tra cung nam xuat ban
	// truyen vao 1 cuon sach khac
	public boolean kiemTraCungNamXuatBan(Sach sachkhac) {
		if(this.namXuatBan == sachkhac.namXuatBan) {
			return true;
		}
		else {
			return false;
		}
	}
	// sach dc giam gia
	// phai ep kieu 
	public double sauKhiGiamGia(double x) {
		return this.giaSach*(1-x/100); // day la cach tinh gia sau khi giam
	}
	public double maGiamGia(double x) {
		return x;
	}
}
