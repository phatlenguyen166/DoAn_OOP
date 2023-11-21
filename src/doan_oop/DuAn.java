package doan_oop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class DuAn {

    private String idDa;
    //NhanVien listNvTg[]';
    private String tenDuAn;
    private String ngayBatDau;
    private String ngayKetThuc;
    private double tongChiPhi;
    static Scanner sc = new Scanner(System.in);
    
    public String getIdDa() {
        return idDa;
    }

    public void setIdDa(String idDa) {
        this.idDa = idDa;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getTongChiPhi() {
        return tongChiPhi;
    }

    public void setTongChiPhi(double tongChiPhi) {
        this.tongChiPhi = tongChiPhi;
    }

    public void inputDuAn() {
       
       
        System.out.println("+Nhap ten du an: "
                + "");
        String name=sc.nextLine();
        setTenDuAn(name);
        System.out.println("+Nhap ngay bat dau: ");
        String start=sc.nextLine();
        setNgayBatDau(start);
        System.out.println("+Nhap ngay ket thuc: ");
        String end=sc.nextLine();
        setNgayBatDau(end);
        System.out.println("+Nhap tong chi phi: ");
        Double price=Double.parseDouble(sc.nextLine());
        setTongChiPhi(price);
    }

    @Override
    public String toString() {
        return "DuAn{" + "idDa=" + idDa + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", tongChiPhi=" + tongChiPhi + '}';
    }

//    public void dsNhanvienthamgia() {
//          System.out.println("");
//    }
//    
}





