package baitapquanlysieuthi;
import java.time.LocalDate;

public class HangThucPham extends Product {
	
	private LocalDate ngaySX;
	private LocalDate ngayHetHan;
	private String NCC;

	public HangThucPham(String maHang, String ten, int SLTK, double donGia, LocalDate ngaySX, LocalDate ngayHetHan, String NCC) {
		super(maHang, ten, SLTK, donGia);
		this.ngaySX = ngaySX;		
		this.ngayHetHan = ngayHetHan;
		this.NCC = NCC;
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	
	public String getNCC() {
		return NCC;
	}

	public void setNCC(String nCC) {
		NCC = nCC;
	}

	@Override
	public double VAT() {
		return 0.05 * SLTK * donGia;	
	}

	@Override
	public String danhGiaMucDoTieuThu() {
		LocalDate currentDate = LocalDate.now();
        if (SLTK > 0 && ngayHetHan.isBefore(currentDate)) 
        	return "Kho ban!";
	    return "Ban duoc";
	}
}
