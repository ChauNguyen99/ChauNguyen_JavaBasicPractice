package baitapquanlyxe;

public class XeMay implements TinhTienThue{

	private double amount;
	
	public XeMay(double amount) {
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
		return ((amount/100) * 10) * 5;
	}

	@Override
	public void displayInfo() {
		System.out.println("Thue cua xe may la: " + calVAT());
	}
}
