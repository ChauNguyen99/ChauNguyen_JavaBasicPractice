package baitapquanlyxe;

public class MainQLX {

	public static void main(String[] args) {
		XeDap xedap = new XeDap(10);
		xedap.calVAT();
		xedap.displayInfo();
		
		XeMay xemay = new XeMay(50);
		xemay.calVAT();
		xemay.displayInfo();
		
		XeTai xetai = new XeTai(40);
		xetai.calVAT();
		xetai.displayInfo();
		
		XeKhach xekhach = new XeKhach(60, 10);
		xekhach.calVAT();
		xekhach.displayInfo();
	}
}
