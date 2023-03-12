package baitapvedongvatvasukethua;

public abstract class Animal {

	protected String ten; 
	protected int tuoi;
	protected String giong;
	
	public Animal(String ten, int tuoi, String giong) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.giong = giong; 
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGiong() {
		return giong;
	}

	public void setGiong(String giong) {
		this.giong = giong;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Giong: " + giong);
	}
}
