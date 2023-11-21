package doan_oop;

import java.util.Scanner;

public class HoaDon {
    private String idHoaDon;
    //NhanVien listNvTg[]';
    private String tenHoaDon;
    private Ngay ngayGhi;
    private String nguoiKy;
    private double tongChiPhi;

    
    static Scanner sc = new Scanner(System.in);

    public String getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(String idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getTenHoaDon() {
        return tenHoaDon;
    }

    public void setTenHoaDon(String tenHoaDon) {
        this.tenHoaDon = tenHoaDon;
    }

    public Ngay getNgayGhi() {
        return ngayGhi;
    }

    public void setNgayGhi(Ngay ngayGhi) {
        this.ngayGhi = ngayGhi;
    }

    

    public String getNguoiKy() {
        return nguoiKy;
    }

    public void setNguoiKy(String nguoiKy) {
        this.nguoiKy = nguoiKy;
    }
   

    public void setTongChiPhi(double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }
    public double getTongChiPhi() {
        return tongChiPhi;
    }

    public void inputHoaDon() {
       
        System.out.println("+Nhap ma hoa don: ");
        String id=sc.nextLine();
        setIdHoaDon(id);
        System.out.println("+Nhap ten hoa don: ");
        String hoaDon=sc.nextLine();
        setTenHoaDon(hoaDon);
        System.out.println("+Nhap ngay ghi: ");
         Ngay ghi= new Ngay();
         ghi.Nhap();
        setNgayGhi(ghi);
        System.out.println("+Nhap nguoi ky: ");
        String name=sc.nextLine();
        setNguoiKy(name);
        System.out.println("+Nhap chi phi: ");
        Double price=Double.parseDouble(sc.nextLine());
        setTongChiPhi(price);
    }

    
//    public void dsNhanvienthamgia() {
//          System.out.println("");
//    }
//    

    @Override
    public String toString() {
        return "HoaDon{" + "idHoaDon=" + idHoaDon + ", tenHoaDon=" + tenHoaDon + ", ngayGhi=" + ngayGhi.getNgaySinh() + ", nguoiKy=" + nguoiKy + ", tongChiPhi=" + tongChiPhi + '}';
    }
}

