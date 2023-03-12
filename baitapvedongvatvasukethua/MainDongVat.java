package baitapvedongvatvasukethua;

public class MainDongVat {

	public static void main(String[] args) {
		System.out.println("Thong tin cua cho: ");
		Dog dog1 = new Dog("Golden", 5, "Male", "Brown", 10);
		dog1.hienThiThongTin();
		
		System.out.println("------------------------");
		
		System.out.println("Thong tin cua meo: ");
		Cat cat1 = new Cat("Meo Anh long ngan", 3, "Female", "White", 5);
		cat1.hienThiThongTin();
	}

}
