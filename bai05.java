import java.util.Scanner;

// Class Student
class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    public String toString() {
        return "Ma SV: " + stID + ", Ten SV: " + stName + ", Lop: " + stClass;
    }
}

// Class Book
class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }

    public String toString() {
        return "Ma sach: " + boCode + ", Tieu de: " + boTitle + ", Tac gia: " + boAuthor;
    }
}

// Class SanPham
class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
        this.tenSP = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = scanner.nextDouble();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.printf("Ten san pham: %s, Don gia: %.2f, Giam gia: %.2f, Thue nhap khau: %.2f\n",
                tenSP, donGia, giamGia, getThueNhapKhau());
    }
}

// Class Main
public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập và hiển thị thông tin 3 sinh viên
        Student[] danhSachSV = new Student[3];
        System.out.println("Nhap thong tin 3 sinh vien:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma SV: ");
            String stID = scanner.nextLine();
            System.out.print("Ten SV: ");
            String stName = scanner.nextLine();
            System.out.print("Lop: ");
            String stClass = scanner.nextLine();
            danhSachSV[i] = new Student(stID, stName, stClass);
        }

        System.out.println("\nDanh sach sinh vien:");
        for (int i = 0; i < 3; i++) {
            System.out.println(danhSachSV[i].toString());
        }

        // Nhập và hiển thị thông tin 2 sách
        Book[] danhSachSach = new Book[2];
        System.out.println("\nNhap thong tin 2 sach:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Sach thu " + (i + 1) + ":");
            System.out.print("Ma sach: ");
            String boCode = scanner.nextLine();
            System.out.print("Tieu de: ");
            String boTitle = scanner.nextLine();
            System.out.print("Tac gia: ");
            String boAuthor = scanner.nextLine();
            danhSachSach[i] = new Book(boCode, boTitle, boAuthor);
        }

        System.out.println("\nDanh sach sach:");
        for (int i = 0; i < 2; i++) {
            System.out.println(danhSachSach[i].toString());
        }

        // Nhập và hiển thị thông tin 2 sản phẩm
        SanPham[] danhSachSP = new SanPham[2];
        System.out.println("\nNhap thong tin 2 san pham:");
        for (int i = 0; i < 2; i++) {
            System.out.println("San pham thu " + (i + 1) + ":");
            danhSachSP[i] = new SanPham();
            danhSachSP[i].nhap();
        }

        System.out.println("\nDanh sach san pham:");
        for (int i = 0; i < 2; i++) {
            danhSachSP[i].xuat();
        }

        scanner.close();
    }
}