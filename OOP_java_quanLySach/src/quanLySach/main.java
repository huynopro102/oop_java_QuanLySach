package quanLySach;

public class main {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(3, 10, 2000);
		Ngay ngay2 = new Ngay(2, 3, 2010);
		Ngay ngay3 = new Ngay(2, 3, 2010);
		// den phan nhap ngay thi chon ngay o tren 
		TacGia tacgia1 = new TacGia("huy no pro", ngay2);
		TacGia tacgia2 = new TacGia("an no pro ", ngay2);
		TacGia tacgia3 = new TacGia("huy no pro 1", ngay3);
		//
		Sach sach1 = new Sach("sach 1 lap trinh c ", 1000, 2020, tacgia1);
		Sach sach2 = new Sach("sach 2 lap trinh java " , 2000, 2011, tacgia2);
		Sach sach3 = new Sach("sach 3 lap trinh python " , 4000,2001 , tacgia3);
		// cac phuong thuc 
		System.out.println(sach1.getTenSach());
		System.out.println(sach2.getTenSach());
		System.out.println(sach3.getTenSach());
		// kiem tra nam xuat ban cua sach
		System.out.println("kiem tra sach 1 voi sach 2 co cung nam xuat ban : "+sach1.kiemTraCungNamXuatBan(sach2));
		System.out.println("kiem tra sach 2 voi sach 3 co cung nam xuat ban : "+sach2.kiemTraCungNamXuatBan(sach3));
		// sau khi giam gia 
		System.out.println( sach1.getTenSach()+"sau khi giam gia "+sach1.maGiamGia(4)+"% : "+sach1.sauKhiGiamGia(4));
		System.out.println(sach2.getTenSach()+"sau khi giam gia "+sach2.maGiamGia(5)+"% : "+sach2.sauKhiGiamGia(5));
		System.out.println(sach3.getTenSach()+"sau khi giam gia "+sach3.maGiamGia(20)+"%  : "+sach3.sauKhiGiamGia(20));
	}
}
  