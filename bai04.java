import java.util.Scanner;
class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thuePhaiNop;

    public Vehicle() {
        this.tenChuXe = "";
        this.loaiXe = "";
        this.dungTich = 0;
        this.triGia = 0.0;
        this.thuePhaiNop = 0.0;
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = tinhThue();
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    private double tinhThue() {
        double thue = 0.0;
        if (dungTich < 100) {
            thue = triGia * 0.01;
        } else if (dungTich <= 200) {
            thue = triGia * 0.03;
        } else {
            thue = triGia * 0.05;
        }
        return thue;
    }
}

public class bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong xe: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Vehicle[] danhSachXe = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin xe thu " + (i + 1) + ":");
            System.out.print("Ten chu xe: ");
            String tenChuXe = scanner.nextLine();
            System.out.print("Loai xe: ");
            String loaiXe = scanner.nextLine();
            System.out.print("Dung tich: ");
            int dungTich = scanner.nextInt();
            System.out.print("Tri gia: ");
            double triGia = scanner.nextDouble();
            scanner.nextLine();

            danhSachXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
        }

        System.out.println("Thong tin xe va thue phai nop:");
        System.out.printf("%-20s %-15s %-10s %-15s %-15s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-10d %-15.2f %-15.2f\n",
                    danhSachXe[i].getTenChuXe(),
                    danhSachXe[i].getLoaiXe(),
                    danhSachXe[i].getDungTich(),
                    danhSachXe[i].getTriGia(),
                    danhSachXe[i].getThuePhaiNop());
        }

        scanner.close();
    }
}