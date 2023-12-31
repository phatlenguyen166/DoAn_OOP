package doan_oop;

import java.util.Scanner;

public class KhenthuongKyluat {

    static public Scanner sc = new Scanner(System.in);
    private int soNgaynghi;
    private int soLanditre;
    private int soNgaytangca;
    private double tienPhat;
    private double tienThuong;

    public KhenthuongKyluat(int soNgaynghi, int soLanditre, int soNgaytangca, double tienPhat, double tienThuong) {
        this.soNgaynghi = soNgaynghi;
        this.soLanditre = soLanditre;
        this.soNgaytangca = soNgaytangca;
        this.tienPhat = tienPhat;
        this.tienThuong = tienThuong;
    }

    public KhenthuongKyluat() {
    }

    public int getSoNgaynghi() {
        return soNgaynghi;
    }

    public void setSoNgaynghi(int soNgaynghi) {
        while (true) {
            if (soNgaynghi >= 0 && soNgaynghi < 30) {
                break;
            }
            System.out.println("Nhap so ngay nghi: ");
            soNgaynghi = Integer.parseInt(sc.nextLine());
        }
        this.soNgaynghi = soNgaynghi;
    }

    public int getSoLanditre() {
        return soLanditre;
    }

    public void setSoLanditre(int soLanditre) {
        while (true) {
            if (soLanditre >= 0 && soLanditre < 30) {
                break;
            }
            System.out.println("Nhap so ngay nghi: ");
            soLanditre = Integer.parseInt(sc.nextLine());
        }
        this.soLanditre = soLanditre;
    }

    public int getSoNgaytangca() {
        return soNgaytangca;
    }

    public void setSoNgaytangca(int soNgaytangca) {
        while (true) {
            if (soNgaytangca >= 0 && soNgaytangca < 30) {
                break;
            }
            System.out.println("Nhap so ngay nghi: ");
            soNgaytangca = Integer.parseInt(sc.nextLine());
        }
        this.soNgaytangca = soNgaytangca;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public void Nhap() {
        System.out.println("Hay nhap so ngay nghi: ");
        setSoNgaynghi(Integer.parseInt(sc.nextLine()));
        System.out.println("Hay nhap so lan di tre: ");
        setSoLanditre(Integer.parseInt(sc.nextLine()));
        System.out.println("Hay nhap so ngay tang ca: ");
        setSoNgaytangca(Integer.parseInt(sc.nextLine()));
        tinhTienPhat();
        tinhTienThuong();
    }

    public void tinhTienPhat() {
        this.tienPhat = soNgaynghi * 100000 + soLanditre * 20000;

    }

    @Override
    public String toString() {
        return soNgaynghi + "|" + soLanditre + "|" + soNgaytangca + "|" + tienPhat + "|" + tienThuong;
    }

    public String disphay() {
        return "so ngay nghi: " + soNgaynghi + " || so lan di tre: " + soLanditre + " || So ngay tang ca: "
                + soNgaytangca + " || Tien phat: " + tienPhat + " || Tien thuong: " + tienThuong;
    }

    public void tinhTienThuong() {
        this.tienThuong = soNgaytangca * 200000;
    }
//    public static void main(String[] args) {
//        KhenthuongKyluat kt=new KhenthuongKyluat();
//        kt.Nhap();
//        System.out.println(kt.toString());
//    }
}
