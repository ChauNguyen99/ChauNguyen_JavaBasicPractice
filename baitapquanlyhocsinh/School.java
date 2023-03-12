package baitapquanlyhocsinh;
import java.util.ArrayList;

public class School {
	
	private String tenLop;
	private ArrayList<HocSinh> hocSinhs;
	
	public School(String tenLop) {
		this.tenLop = tenLop;
		hocSinhs = new ArrayList<>();
	}
	
	public void themHS(HocSinh hocSinh) {
		hocSinhs.add(hocSinh);
	}
	
	public void hienThiDSHS() {
		System.out.println("Lop " + tenLop + " gom cac hoc sinh sau: ");
        for (HocSinh hocSinh : hocSinhs) {
            System.out.println(hocSinh);
        }
	}
	
	public void hienThiDSHS20Tuoi() {
        System.out.println("DS hoc sinh 20 tuoi la:");
        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.getTuoi() == 20) {
                System.out.println(hocSinh);
            }
        }
    }
	
	public int demSoLuongHSTheoDieuKien(int tuoi, String queQuan) {
        int count = 0;
        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.getTuoi() == 23 && hocSinh.getQueQuan().equals("Da Nang")) {
                count++;
            }
        }
        return count;
    }
}
