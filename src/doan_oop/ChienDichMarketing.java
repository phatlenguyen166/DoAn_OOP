package doan_oop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ChienDichMarketing {
    private String idChienDich;
    //NhanVien listNvTg[];
    private String idLeader;
   // private NhanVien leader;
    private String tenChienDich;
    private String ngayBatDau;
    private String ngayKetThuc;
    private double tongChiPhi;
    static Scanner sc = new Scanner(System.in);

    public String getIdChienDich() {
        return idChienDich;
    }

    public void setIdChienDich(String idChienDich) {
        this.idChienDich = idChienDich;
    }

    public String getIdLeader() {
        return idLeader;
    }

    public void setIdLeader(String idLeader) {
        this.idLeader = idLeader;
    }
    
   
    
//    public NhanVien getLeader() {
//        return leader;
//    }
//
//    public void setLeader(NhanVien leader) {
//        this.leader = leader;
//    }

    public String getTenChienDich() {
        return tenChienDich;
    }

    public void setTenChienDich(String tenChienDich) {
        this.tenChienDich = tenChienDich;
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

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        ChienDichMarketing.sc = sc;
    }
    
   

   public void inputChienDich() {
        System.out.println("+Nhap id chien dich: ");
        String id=sc.nextLine();
        setIdChienDich(id);
        System.out.println("+Nhap ten chien dich: ");
        String name=sc.nextLine();
        setTenChienDich(name);
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

   

//    public void dsNhanvienthamgia() {
//          System.out.println("");
//    }
//    
    @Override
    public String toString() {
        return "ChienDichMarketing{" + "idChienDich=" + idChienDich + ", leader=" + idLeader + ", tenChienDich=" + tenChienDich + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", tongChiPhi=" + tongChiPhi + '}';
    }
}


