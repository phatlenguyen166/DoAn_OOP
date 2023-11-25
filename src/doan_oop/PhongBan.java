package doan_oop;

import java.util.Scanner;

public abstract class PhongBan {
    private String maPhongBan;
    private  String tenPhongBan;
    private double heSoLuong;
    private double luongCoBan;
    static Scanner sc = new Scanner(System.in);
    public PhongBan(){

    }
    public PhongBan(String maPhongBan){
        this.maPhongBan=maPhongBan;
    }
    public PhongBan(String maPhongBan,String tenPhongBan,double heSoLuong,double luongCoBan){
        this.maPhongBan=maPhongBan;
        this.tenPhongBan=tenPhongBan;
        this.heSoLuong=heSoLuong;
        this.luongCoBan=luongCoBan;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    @Override
    public String toString() {
        return maPhongBan + "|" + tenPhongBan + "|" + heSoLuong + "|" + luongCoBan;
    }
    
    public abstract double tinhLuong();
    public abstract void nhap();
}
