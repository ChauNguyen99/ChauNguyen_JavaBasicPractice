package baitapvedongvatvasukethua;

public class Cat extends Animal {
	
	private String mauLong;
	private double chieuCao;

	public Cat(String ten, int tuoi, String giong, String mauLong, double chieuCao) {
		super(ten, tuoi, giong);
		this.mauLong = mauLong;
		this.chieuCao = chieuCao;
	}
	
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Mau long: " + mauLong);
        System.out.println("Chieu cao: " + chieuCao + " cm");
	}

}
