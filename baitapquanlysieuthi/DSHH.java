package baitapquanlysieuthi;
import java.util.ArrayList;

public class DSHH {
	private ArrayList<Product> DSHH;

    public DSHH() {
    	DSHH = new ArrayList<>();
    }

    public boolean themHH(Product product) {
        for (Product pro : DSHH) {
            if (pro.getMaHang().equals(product.getMaHang())) {
                return false; 
            }
        }
        DSHH.add(product);
        return true;
    }

    public ArrayList<Product> getDSProduct() {
        return DSHH;
    }
}
