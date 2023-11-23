package doan_oop;

import java.util.Scanner;

public class BaoHiem {
    static public Scanner sc = new Scanner(System.in);
    private String MaBH;
    private String loaiBH;
    private int tienBH;
    private String noiCap;
    private String ngayCap;
    
    public BaoHiem() {
    }

    public BaoHiem(String MaBH, String loaiBH, int tienBH, String noiCap, String ngayCap) {
        this.MaBH = MaBH;
        this.loaiBH = loaiBH;
        this.tienBH = tienBH;
        this.noiCap = noiCap;
        this.ngayCap = ngayCap;
    }

    public String getMaBH() {
        return MaBH;
    }

    public void setMaBH(String MaBH) {
        for(;;){
            if(!MaBH.equals("")) {
                break;
            }
            System.out.println("Hay nhap ma bao hiem: ");
            MaBH = sc.nextLine();
        }
        this.MaBH = MaBH;
    }

    public String getLoaiBH() {
        return loaiBH;
    }

    public void setLoaiBH(String loaiBH) {
        while(!(loaiBH.equalsIgnoreCase("bao hiem y te")|| loaiBH.equalsIgnoreCase("bao hiem tai nan"))){
            System.out.println("Nhap lai loai bao hiem:");
            loaiBH=sc.nextLine();
        }
        this.loaiBH = loaiBH;
    }

    public int getTienBH() {
        return tienBH;
    }

    public void setTienBH(int tienBH) {
        this.tienBH = tienBH;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public String getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap = ngayCap;
    }

    public void InsertInfo(){
        System.out.println("Hay nhap ma bao hiem: ");
        MaBH = sc.nextLine();
        System.out.println("Hay nhap loai bao hiem: ");
        loaiBH = sc.nextLine();
        System.out.println("Hay nhap tien bao hiem: ");
        tienBH = Integer.parseInt(sc.nextLine());
        System.out.println("Hay nhap noi cap: ");
        noiCap = sc.nextLine();
        System.out.println("Hay nhap ngay cap: ");
        ngayCap = sc.nextLine();
    }

    @Override
    public String toString(){
        return String.format( "%20s%30s%20d%50s%20s", MaBH, loaiBH, tienBH, noiCap, ngayCap);
    }
    public void display(){
        System.out.println(toString());
    }
}