package baitapquanlysieuthi;
import java.time.LocalDate;

public class HangSanhSu extends Product {
	
	private String NSX;
	private LocalDate ngayNhapKho;

	public HangSanhSu(String maHang, String ten, int SLTK, double donGia, String NSX, LocalDate ngayNhapKho) {
		super(maHang, ten, SLTK, donGia);
		this.NSX = NSX;
		this.ngayNhapKho = ngayNhapKho;
	}

	public String getNSX() {
		return NSX;
	}

	public void setNSX(String nSX) {
		NSX = nSX;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	@Override
	public String danhGiaMucDoTieuThu() {
		LocalDate currentDate = LocalDate.now();
        if (SLTK > 50 && currentDate.isAfter(ngayNhapKho.plusDays(10))) 
            return "Ban cham!";
        return "Ban duoc!";	
	}

	@Override
	public double VAT() {
		return 0.1 * SLTK * donGia;		
	}

}
