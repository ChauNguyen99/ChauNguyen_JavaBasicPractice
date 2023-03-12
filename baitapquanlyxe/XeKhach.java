package baitapquanlyxe;

public class XeKhach implements TinhTienThue{

	private double amount;
	private int choNgoi;
	
	public XeKhach(double amount, int choNgoi) {
		this.amount = amount;
		this.choNgoi = choNgoi;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getChoNgoi() {
		return choNgoi;
	}

	public void setChoNgoi(int choNgoi) {
		this.choNgoi = choNgoi;
	}

	@Override
	public double calVAT() {
		if(choNgoi >= 5) 
			return amount * 0.6;
		return amount * 0.8; 
	}

	@Override
	public void displayInfo() {
		System.out.println("Thue cua xe khach la: " + calVAT());
	}
}
