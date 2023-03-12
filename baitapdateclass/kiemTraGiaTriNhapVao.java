package baitapdateclass;

public class kiemTraGiaTriNhapVao {
	private int year;
	private int month;
	private int day;

	public kiemTraGiaTriNhapVao(int year, int month, int day) {
		if (year <= 0 || month <= 0 || (day <= 0 && day > 31)) {
			System.out.println("Gia tri khong hop le.");
			return;
		}
		System.out.println("Gia tri nhap vao hop le.");
	}

	public void kiemtraNamNhuan(int year, int month, int day) {
		if (month == 2 && year % 4 == 0 || year % 400 == 0) {
			if (day == 29) {
				System.out.println("Day la nam nhuan.");
				return;
			}
			if (day > 29) {
				System.out.println("Gia tri khong hop le.");
				return;
			}
			System.out.println("Khong phai nam nhuan.");
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.println("Gia tri khong hop le.");
				return;
			}
			System.out.println("Gia tri hop le la: " + year + "/" + month + "/" + day);
			return;
		}
		if (day > 30) {
			System.out.println("Gia tri khong hop le.");
			return;
		}
		System.out.println("Gia tri hop le la: " + year + "/" + month + "/" + day);
		return;
	}

}