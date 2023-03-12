package baitapquanlyhocsinh;

public class MainQLHS {

	public static void main(String[] args) {
		School school = new School("12C6");

        // Them HS
        school.themHS(new HocSinh("Nguyen Nu Ngoc Chau", 20, "Khanh Hoa"));
        school.themHS(new HocSinh("Nguyen Nu Ngoc Anh", 23, "Da Nang"));
        school.themHS(new HocSinh("Ngo Thi Ngoc Xuan", 23, "Da Nang"));
        school.themHS(new HocSinh("Nguyen Trung Hieu", 26, "Da Nang"));

        // Hien thi DSHS
        school.hienThiDSHS();
        
        System.out.println("--------------------------------");
        // Hien thi DSHS 20 tuoi
        school.hienThiDSHS20Tuoi();

        System.out.println("--------------------------------");
        // Dem SLHS
        int count = school.demSoLuongHSTheoDieuKien(23, "Da Nang");
        System.out.println("Co " + count + " HS 23 tuoi va que o Da Nang");
	}

}
