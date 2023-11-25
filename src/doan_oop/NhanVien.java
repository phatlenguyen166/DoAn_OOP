package doan_oop;

import java.util.Scanner;

public class NhanVien {

    private String id;
    private String ten;
    private Ngay NS = new Ngay();
    private PhongBan phongBan;
    private int CCCD;
    private String chucVu;
    private String gioiTinh;
    private double luong;
    private BaoHiem baoHiem = new BaoHiem();
    private HopDong hopDong = new HopDong();
    private KhenthuongKyluat khenThuongKyLuat = new KhenthuongKyluat();
    static Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String id, String ten, Ngay NS, String gioiTinh, int CCCD,
            String chucVu, PhongBan phongBan, double luong, BaoHiem baoHiem, HopDong hopDong,KhenthuongKyluat khenThuongKyLuat) {
        this.id = id;
        this.ten = ten;
        this.NS = NS;
        this.CCCD = CCCD;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.phongBan = phongBan;
        this.luong = luong;
        this.baoHiem = baoHiem;
        this.hopDong = hopDong;
        this.khenThuongKyLuat = khenThuongKyLuat;
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

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public double getLuong() {
        return luong;
    }

    public BaoHiem getBaoHiem() {
        return baoHiem;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public KhenthuongKyluat getKhenThuongKyLuat() {
        return khenThuongKyLuat;
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

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setBaoHiem(BaoHiem baoHiem) {
        this.baoHiem = baoHiem;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public void setKhenThuongKyLuat(KhenthuongKyluat khenThuongKyLuat) {
        this.khenThuongKyLuat = khenThuongKyLuat;
    }

    public void Nhap() {
        System.out.print("+Nhap ID cua nhan vien: ");
        setId(sc.nextLine());
        System.out.print("+Nhap ten cua nhan vien: ");
        setTen(sc.nextLine());
        System.out.print("+Nhap gioi tinh : ");
        setGioiTinh(sc.nextLine());
        System.out.println("||==== Nhap ngay thang nam sinh ====|| ");
        NS.Nhap();
        System.out.print("Nhap so can cuoc cong: ");
        setCCCD(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhap chuc vu cua nhan vien: ");
        setChucVu(sc.nextLine());
        System.out.println("Nhap thong tin phong ban: ");
        menuPhongBan();
        System.out.println("Nhap thong tin bao hiem: ");
        baoHiem.InsertInfo();
        System.out.println("Nhap thong tin hop dong");
        hopDong.inputHopDong();
        System.out.println("Nhap thong tin khen thuong ky luat");
        khenThuongKyLuat.Nhap();
        luong = luong - khenThuongKyLuat.getTienPhat() + khenThuongKyLuat.getTienThuong();
    }

    public void Xuat() {
        System.out.println("ID: " + id + " || " + "Ten: " + ten + " || " + " Ngay sinh: " + NS.getNgaySinh() +
                " || " + "Gioi tinh: " + gioiTinh + " || " + "CCCD: " + CCCD + " || " + "Chuc vu: " + chucVu +
                " || " + "Ma phong ban: " + phongBan.getMaPhongBan() + " || " + "Luong: " + getLuong() + 
                " || " + baoHiem.display() + " || " + "id hop dong: " + hopDong.getIdHD()+ " || " +khenThuongKyLuat.disphay());
    }

    public void menuPhongBan() {
        System.out.println("||============ Chon thao tac ===============||");
        System.out.println("||1. Nhan vien thuoc phong Ky Thuat         ||");
        System.out.println("||2. Nhan vien thuoc phong Ke Toan          ||");
        System.out.println("||3. Nhan vien thuoc phong Marketing        ||");
        System.out.println("||==========================================||");
        System.out.print("Nhap thao tac: ");
        int choice = 0;
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1: {
                phongBan = new KyThuat("KTHUAT", "Ky Thuat", 3.2, 2500000);
                phongBan.nhap(); // nhap so lan sua chua de tinh + vao luong;
                setLuong(phongBan.tinhLuong());
                hopDong.setTenPB("Ky Thuat");
                break;
            }
            case 2: {
                phongBan = new KeToan("KTOAN", "Ke Toan", 2.3, 2000000);
                phongBan.nhap();    // nhap so gio tang ca de tinh + vao luong;
                setLuong(phongBan.tinhLuong());
                hopDong.setTenPB("Ke Toan");
                break;
            }
            case 3: {
                phongBan = new Marketing("MKT", "Marketing", 2.8, 2200000);
                phongBan.nhap();  // nhap so lan chot deal de tinh + vao luong;
                setLuong(phongBan.tinhLuong());
                hopDong.setTenPB("Marketing");
                break;
            }
            default: {
                System.out.println("Nhap sai moi nhap lai!!");
            }
        }
    }

}
