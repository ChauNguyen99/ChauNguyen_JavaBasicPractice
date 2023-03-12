package baitapquanlysieuthi;

public abstract class Product {

	protected String maHang;
	protected String ten;
	protected int SLTK;
	protected double donGia;
	
	public Product(String maHang, String ten, int SLTK, double donGia) {
		this.maHang = maHang;
		this.ten = ten;
		this.SLTK = SLTK;
		this.donGia = donGia;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSLTK() {
		return SLTK;
	}

	public void setSLTK(int sLTK) {
		SLTK = sLTK;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public abstract double VAT();
	
	public abstract String danhGiaMucDoTieuThu();
	
	public double tinhTien() {
        return SLTK * donGia + VAT();
    }

}
