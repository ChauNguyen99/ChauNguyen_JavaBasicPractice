package baitapquanlyxe;

public class XeDap implements TinhTienThue{
	
	private double amount;
	
	public XeDap(double amount) {
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
		return (amount * 0);
	}

	@Override
	public void displayInfo() {
		System.out.println("Xe dap khong dong thue! " + calVAT());
	}
}
