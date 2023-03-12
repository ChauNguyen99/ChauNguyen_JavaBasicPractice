package baitapquanlyxe;

public class XeTai implements TinhTienThue{

	private double amount;
	
	public XeTai(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public double calVAT() {
		return ((amount/100) * 10) * 2;
	}

	@Override
	public void displayInfo() {
		System.out.println("Thue cua xe tai la: " + calVAT());
	}

}
