package baitapquanlysieuthi;

public class HangDienMay extends Product {
	
	private int thoiGianBaoHanh;
	private double congSuat;

	public HangDienMay(String maHang, String ten, int SLTK, double donGia, int thoiGianBaoHanh, double congSuat) {
		super(maHang, ten, SLTK, donGia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String danhGiaMucDoTieuThu() {
		if (SLTK < 3) 
            return "Ban duoc!";
        return "Khong ban duoc!";
	}

	@Override
	public double VAT() {
		return 0.1 * SLTK * donGia;
	}

}
