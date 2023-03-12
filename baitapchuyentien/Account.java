package baitapchuyentien;

public class Account {
	
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void credit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap tien thanh cong. So du tai khoan la: " + balance);
            return;
        } 
        System.out.println("So tien nap vao khong hop le.");
    }
	
	public void debit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid param.");
        }
        else if (amount > balance) {
            System.out.println("Thanh toan khong thanh cong. So tien thanh toan vuot qua so du.");
        } 
        else {
            balance -= amount;
            System.out.println("Thanh toan thanh cong. So du tai khoan la " + balance);
            return;
        }
    }
	
	public void transferTo(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Chuyen tien khong thanh cong. So tien chuyen vuot qua so du tai khoan.");
        } 
        else {
            balance -= amount;
            account.credit(amount);
            System.out.println("Chuyen tien thanh cong. So du tai khoan la " + balance);
        }
    }
}
