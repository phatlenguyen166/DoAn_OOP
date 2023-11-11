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

public abstract class NhanVien {
    private String id;
    private String ten;
    private Ngay NS;
    private Luong luong;
    private PhongBan PB;
    private String CCCD;
    private BaoHiem BH
    private KhenThuongKyLuat KTKL;
    private HopDong HD;
    private String chucVu;
    private String gioiTinh;
    
    static Scanner sc = new Scanner(System.in);
    
    public NhanVien() {
    }

    public NhanVien(String id, String ten, Ngay NS, Luong luong,String CCCD, PhongBan PB, BaoHiem BH, KhenThuongKyLuat KTKL, HopDong HD, String chucVu,String gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.NS = NS;
        this.luong = luong;
        this.CCCD = CCCD;
        this.PB = PB;
        this.BH = BH;
        this.KTKL = KTKL;
        this.HD = HD;
        this.chucVu = chucVu;
        this.gioiTinh= gioiTinh;
    }

    public String getId() {
        return id;
    }

    public String getCCCD() {
        return CCCD;
    }
    
    
    public String getTen() {
        return ten;
    }

    public Ngay getNS() {
        return NS;
    }

    public Luong getLuong() {
        return luong;
    }

    public PhongBan getPB() {
        return PB;
    }

    public BaoHiem getBH() {
        return BH;
    }

    public KhenThuongKyLuat getKTKL() {
        return KTKL;
    }

    public HopDong getHD() {
        return HD;
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

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    
    
    public void setNS(Ngay NS) {
        this.NS = NS;
    }

    public void setLuong(Luong luong) {
        this.luong = luong;
    }

    public void setPB(PhongBan PB) {
        this.PB = PB;
    }

    public void setBH(BaoHiem BH) {
        this.BH = BH;
    }

    public void setKTKL(KhenThuongKyLuat KTKL) {
        this.KTKL = KTKL;
    }

    public void setHD(HopDong HD) {
        this.HD = HD;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ten=" + ten + ", NS=" + NS + ", luong=" + luong + ", PB=" + PB + ", BH=" + BH + ", KTKL=" + KTKL + ", HD=" + HD + ", chucVu=" + chucVu + ", gioiTinh=" + gioiTinh + '}';
    }

    public void display(){
         System.out.println(toString());
    }
    
    public void input(){    
        System.out.print("+Nhap ID cua nhan vien: ");
        setId(sc.nextLine());
        System.out.print("+Nhap ten cua nhan vien: ");
        setTen(sc.nextLine());
        System.out.print("+Nhap gioi tinh cua nhan vien: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nhap ngay thang nam sinh cua nhan vien: ");
        NS.Nhap();
        System.out.print("Nhap so can cuoc cong cua nhan vien: ");
        setCCCD(sc.nextLine());
        System.out.print("Nhap chuc vu cua nhan vien: ");
        setChucVu(sc.nextLine());
    }

}
    
