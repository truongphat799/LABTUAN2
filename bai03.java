import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = diemTH = 0.0f;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() { return maSV; }
    public void setMaSV(int maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public float getDiemLT() { return diemLT; }
    public void setDiemLT(float diemLT) { this.diemLT = diemLT; }

    public float getDiemTH() { return diemTH; }
    public void setDiemTH(float diemTH) { this.diemTH = diemTH; }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(139, "Truong Gia Phat", 8.5f, 8.0f);
        SinhVien sv2 = new SinhVien(179, "Nguyen Minh Tan", 8.0f, 7.0f);
        SinhVien sv3 = new SinhVien();

        System.out.print("Nhap ma sinh vien: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine(); 
        
        System.out.print("Nhap ho ten: ");
        sv3.setHoTen(scanner.nextLine());

        System.out.print("Nhap diem LT: ");
        sv3.setDiemLT(scanner.nextFloat());
        
        System.out.print("Nhap diem TH: ");
        sv3.setDiemTH(scanner.nextFloat());
        
        scanner.close();

        System.out.println("\nDanh sach sinh vien:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
