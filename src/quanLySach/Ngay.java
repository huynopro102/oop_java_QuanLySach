package quanLySach;

public class Ngay {
	private int ngay;
	private int thang;
	private int nam;
	// tao 1 ham constructor
	public Ngay(int ngay , int thang ,int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	// ghi ham set de thay doi gia tri , ghi ham get de lay dc gia tri
	public int getNgay() {
		return this.ngay;
	}
	public int getThang() {
		return this.thang;
	}
	public int getNam() {
		return this.nam;
	}
	// ham set de thay doi gia tri cua object
	public void setNgay(int ng) {
		this.ngay = ng;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
}
