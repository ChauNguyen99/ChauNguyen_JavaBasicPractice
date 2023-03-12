package baitapchuyentien;

public class MainChuyenTien {

	public static void main(String[] args) {
		Account acc1 = new Account("1", "Tai khoan 1: ", 1000);
        Account acc2 = new Account("2", "Tai khoan 2: ", 3000);
        acc1.credit(5000);
        acc1.debit(2000);
        acc1.transferTo(acc2, 8000);
        System.out.println("So du tai khoan 1 la: " + acc1.getBalance());
        System.out.println("So du tai khoan 2 la: " + acc2.getBalance());
	}

}
