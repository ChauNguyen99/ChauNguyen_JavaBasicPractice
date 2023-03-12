package baitapquanlysieuthi;
import java.time.LocalDate;

public class MainQLSieuThi {

	public static void main(String[] args) {
		DSHH DSHH = new DSHH();
		HangThucPham tp = new HangThucPham("001", "Rau", 10, 10000, LocalDate.of(2021, 5, 20), LocalDate.of(2022,  5, 20), "Ngoc Chau");
		HangSanhSu ss = new HangSanhSu("002", "Ly thuy tinh", 200, 20000, "Ngoc Anh", LocalDate.of(2021, 1, 1));
		HangDienMay dm = new HangDienMay("003", "Tivi", 30, 6500000, 12, 220);
		
		DSHH.themHH(tp);
		DSHH.themHH(ss);
		DSHH.themHH(dm);

		double giaBanTP = tp.tinhTien(); 
		double giaBanSS = ss.tinhTien(); 
		double giaBanDM = dm.tinhTien(); 

		System.out.printf("Tong gia tri TP trong kho: %.2f\n", giaBanTP);
		System.out.printf("Tong gia tri SS trong kho: %.2f\n", giaBanSS);
		System.out.printf("Tong gia tri DM trong kho: %.2f\n", giaBanDM);

		String mucDoTieuThuTP = tp.danhGiaMucDoTieuThu();
		String mucDoTieuThuTPSS = ss.danhGiaMucDoTieuThu();
		String mucDoTieuThuTPDM = dm.danhGiaMucDoTieuThu();

		System.out.println("Danh gia muc do tieu thu - Hang Thuc Pham: " + mucDoTieuThuTP);
		System.out.println("Danh gia muc do tieu thu - Hang Sanh Su: " + mucDoTieuThuTPSS);
		System.out.println("Danh gia muc do tieu thu - Hang Dien May: " + mucDoTieuThuTPDM);

	}

}
