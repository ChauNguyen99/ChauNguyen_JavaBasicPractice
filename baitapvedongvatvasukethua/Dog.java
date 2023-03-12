package baitapvedongvatvasukethua;

public class Dog extends Animal{

	private String mauSac;
	private double trongLuong;
	
	public Dog(String ten, int tuoi, String giong, String mauSac, double trongLuong) {
		super(ten, tuoi, giong);
		this.mauSac = mauSac;
		this.trongLuong = trongLuong;
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Mau sac: " + mauSac);
        System.out.println("Trong luong: " + trongLuong + " kg");
	}

}
