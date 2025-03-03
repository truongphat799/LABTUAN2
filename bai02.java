public class bai02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double cd = sc.nextDouble();

        while (cd <= 0) {
            System.out.print("Chieu dai phai lon hon 0, nhap lai: ");
            cd = sc.nextDouble();
        }
        
        System.out.print("Nhap chieu rong: ");
        double cr = sc.nextDouble();
        
        while (cr <= 0) {
            System.out.print("Chieu rong phai lon hon 0, nhap lai: ");
            cr = sc.nextDouble();
        }
        
        HinhChuNhat hcn = new HinhChuNhat(cd, cr); 
        
        System.out.println("Ket qua: " + hcn.toString()); 
        
        sc.close(); 
    }
}

class HinhChuNhat {
    private double chieuDai;  
    private double chieuRong; 
    
    public HinhChuNhat(double dai, double rong) { 
        chieuDai = dai;
        chieuRong = rong;
    }
    
    public void setChieuDai(double dai) { 
        chieuDai = dai;
    }
    
    public void setChieuRong(double rong) { 
        chieuRong = rong;
    }
    
    public double getChieuDai() { 
        return chieuDai;
    }
    
    public double getChieuRong() { 
        return chieuRong;
    }
    
    public double tinhDienTich() { 
        return chieuDai * chieuRong;
    }
    
    public double tinhChuVi() { 
        return 2 * (chieuDai + chieuRong);
    }
    
    public String toString() { 
        return "dai = " + chieuDai + ", rong = " + chieuRong + 
               ", dien tich = " + tinhDienTich() + ", chu vi = " + tinhChuVi();
    }
}