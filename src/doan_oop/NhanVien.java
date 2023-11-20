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
        private PhongBan phongBan;
        private int CCCD;
        // private BaoHiem BH
        // private KhenThuongKyLuat KTKL;
        // private HopDong HD;
        private String chucVu;
        private String gioiTinh;
        private double luong;
        static Scanner sc = new Scanner(System.in);
        
        public NhanVien() {
        }

        public NhanVien(String id, String ten, Ngay NS,String gioiTinh,int CCCD, String chucVu,PhongBan phongBan,double luong) {
            this.id = id;
            this.ten = ten;
            this.NS = NS;
            this.CCCD = CCCD;
            this.chucVu = chucVu;
            this.gioiTinh= gioiTinh;
            this.phongBan = phongBan;
            this.luong = luong;
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

        public void display(){
            System.out.println(toString());
        }
        
        public void Nhap(){    
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
            

        }
        public void Xuat(){
            System.out.println("ID: " + id + " || " + "Ten: " + ten + " || " +" Ngay sinh: " + NS.getNgaySinh() +" || "+ "Gioi tinh: " + gioiTinh 
            + " || " +"CCCD: " + CCCD +" || "+"Chuc vu: "+ chucVu +" || " + "Ma phong ban: " +  phongBan.getMaPhongBan() 
            + " || " + "Luong: " + getLuong() );
        }

        public void menuPhongBan(){
            System.out.println("||============ Chon thao tac ===============||");
            System.out.println("||1. Nhan vien thuoc phong Ky Thuat         ||");
            System.out.println("||2. Nhan vien thuoc phong Ke Toan          ||");
            System.out.println("||3. Nhan vien thuoc phong Marketing        ||");
            System.out.println("||0. Quay lai                               ||");
            System.out.println("||==========================================||");
            System.out.print("Nhap thao tac: ");
            int choice = 0;
            choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:{
                    PhongBan phongBan = new KyThuat("KTHUAT","Ky Thuat");
                    setLuong(phongBan.tinhLuong());
                    setPhongBan(phongBan);
                    break;
                }
                case 2:{
                    PhongBan phongBan = new KeToan("KTOAN","Ke Toan");
                    setLuong(phongBan.tinhLuong());
                    setPhongBan(phongBan);
                    break;
                }
                case 3:{
                    PhongBan phongBan = new Marketing("MKT","Marketing"); 
                    setLuong(phongBan.tinhLuong());
                    setPhongBan(phongBan);
                    break;
                }
                case 0: break;
                default:{
                    System.out.println("Nhap sai moi nhap lai!!");
                }
            }
        }
    }


