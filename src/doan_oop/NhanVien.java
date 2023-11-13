/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan_oop;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class NhanVien {
    private String id;
    private String ten;
    private Ngay NS = new Ngay();
    // private Luong luong;
    // private PhongBan PB;
     private int CCCD;
    // private BaoHiem BH
    // private KhenThuongKyLuat KTKL;
    // private HopDong HD;
    private String chucVu;
    private String gioiTinh;
    
    static Scanner sc = new Scanner(System.in);
    
    public NhanVien() {
    }

    public NhanVien(String id, String ten, Ngay NS,String gioiTinh,int CCCD, String chucVu) {
        this.id = id;
        this.ten = ten;
        this.NS = NS;
        this.CCCD = CCCD;
        this.chucVu = chucVu;
        this.gioiTinh= gioiTinh;
    }

    public String getId() {
        return id;
    }

    public int getCCCD() {
        return CCCD;
    }
    
    
    public String getTen() {
        return ten;
    }

    public Ngay getNS() {
        return NS;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    
    
    public String getChucVu() {
        return chucVu;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }
    
    
    public void setNS(Ngay NS) {
        this.NS = NS;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ten=" + ten + ", NS=" + NS + ", chucVu=" + chucVu + ", gioiTinh=" + gioiTinh + '}';
    }

    public void display(){
         System.out.println(toString());
    }

    
    public void Nhap(){    
        System.out.print("+Nhap ID cua nhan vien: ");
        setId(sc.nextLine());
        System.out.print("+Nhap ten cua nhan vien: ");
        setTen(sc.nextLine());
        System.out.print("+Nhap gioi tinh cua nhan vien: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nhap ngay thang nam sinh cua nhan vien: ");
        NS.Nhap();
        System.out.print("Nhap so can cuoc cong cua nhan vien: ");
        setCCCD(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap chuc vu cua nhan vien: ");
        setChucVu(sc.nextLine());
    }
    public void Xuat(){
        System.out.println("ID: " + id + " || " + "Ten: " + ten + " || " +" Ngay sinh: " + NS.getNgaySinh() +" || "+ "Gioi tinh: " + gioiTinh 
        + " || " +"CCCD: " + CCCD +" || "+"Chuc vu: "+ chucVu);
    }
}
