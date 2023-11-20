package doan_oop;

import java.util.Scanner;

public abstract class PhongBan {
    private String maPhongBan;
    private  String tenPhongBan;
    static Scanner sc = new Scanner(System.in);
    public PhongBan(){

    }
    public PhongBan(String maPhongBan){
        this.maPhongBan=maPhongBan;
    }
    public PhongBan(String maPhongBan,String tenPhongBan){
        this.maPhongBan=maPhongBan;
        this.tenPhongBan=tenPhongBan;
    }
    public String getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public abstract double tinhLuong();
}
