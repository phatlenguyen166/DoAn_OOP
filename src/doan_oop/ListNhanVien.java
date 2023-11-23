package doan_oop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ListNhanVien implements ThaoTac {
    private int size = 0;
    public NhanVien[] nhanvien = new NhanVien[100];
    static Scanner sc = new Scanner(System.in);

    public ListNhanVien() {

    }

    public ListNhanVien(int size, NhanVien[] nhanvien) {
        super();
        this.size = size;
        this.nhanvien = nhanvien;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NhanVien[] getNhanhanvieniens() {
        return nhanvien;
    }

    public void setNhanhanvieniens(NhanVien[] nhanvien) {
        this.nhanvien = nhanvien;
    }

    @Override
    public void xuat() {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            nhanvien[i].Xuat();
            flag = true;
        }
        if (flag == false)
            System.out.println("Khong co nhan vien de xuat");
    }

    @Override
    public void them() {
        System.out.print("Nhap so luong nhan vien can them: ");
        int soLuongnhanvien = Integer.parseInt(sc.nextLine());
        for (int i = size; i < size + soLuongnhanvien; i++) {
            nhanvien[i] = new NhanVien();
            System.out.println("Nhap thong tin nhan vien can them: ");
            nhanvien[i].Nhap();
            System.out.println("Them nhan vien thanh cong!!");
        }
        size += soLuongnhanvien;
        ghiFile();
    }

    @Override
    public void sua() {
        System.out.println("||============ Chon muc ban muon sua ===============||");
        System.out.println("||1. Sua ho va ten nhan vien                        ||");
        System.out.println("||2. Sua chuc vu cua nhan vien                      ||");
        System.out.println("||0. Quay lai                                       ||");
        System.out.println("||==================================================||");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: {
                System.out.print("Nhap ID nhan vien can sua: ");
                String ID = sc.nextLine();
                String toLowerCase = ID.toLowerCase();
                System.out.print("Nhap ho va ten nhan vien moi : ");
                String newHovaTen = sc.nextLine();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (toLowerCase.equals(nhanvien[i].getId().toLowerCase())) {
                        nhanvien[i].setTen(newHovaTen);
                        System.out.println("Da sua ho va ten thanh cong!");
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co nhan vien de sua");
                }
                ghiFile();
                break;
            }
            case 2: {
                System.out.print("Nhap ID nhan vien can sua: ");
                String ID = sc.nextLine();
                String toLowerCase = ID.toLowerCase();
                System.out.print("nhap chuc vu moi: ");
                String newChucVu = sc.nextLine();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (toLowerCase.equals(nhanvien[i].getId().toLowerCase())) {
                        nhanvien[i].setChucVu(newChucVu);
                        System.out.println("Da sua chuc vu moi thanh cong!");
                    }
                }
                if (flag == false) {
                    System.out.println("Khong co nhan vien de sua");
                }
                ghiFile();
                break;
            }
            case 0:
                break;
            default:
                System.out.println("Thao tac sai moi nhap lai");
        }
    }

    @Override
    public void xoa() {
        System.out.println("||============ Xoa nhan vien ===============||");
        System.out.println("Nhap ID can xoa: ");
        String ID = sc.nextLine();
        String toLowerCase = ID.toLowerCase();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            // Neu id da in hoa giong thi xoa
            if (toLowerCase.equals(nhanvien[i].getId().toLowerCase())) {
                for (int j = i; j < size; j++) {
                    nhanvien[j] = nhanvien[j + 1];
                    flag = true;
                }
                size--;
                ghiFile();
                System.out.println("Da xoa thanh cong!");
            }
        }

        if (flag == false) {
            System.out.println("Khon tim thay nhan vien hoac khong co nhan vien de xoa");
        }
    }

    @Override
    public void timKiem() {
        System.out.println("||============ Chon thao tac tim kiem ===============||");
        System.out.println("||1. Tim nhan vien theo ID                           ||");
        System.out.println("||2. Tim nhan vien theo ho va ten                    ||");
        System.out.println("||3. Tim nhan vien theo ten                          ||");
        System.out.println("||0. Quay lai                                        ||");
        System.out.println("||===================================================||");
        System.out.print("Nhap thao tac : ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: {
                System.out.println("Nhap ID nhan vien can tim: ");
                String ID = sc.nextLine();
                String toLowerCase = ID.toLowerCase();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (toLowerCase.equals(nhanvien[i].getId().toLowerCase())) {
                        nhanvien[i].Xuat();
                        flag = true;
                    }
                }
                if (flag == true) {
                    System.out.println("Khong tim thay nhan vien");
                }
                break;
            }
            case 2: {
                System.out.println("Nhap ho va ten nhan vien can tim kiem: ");
                String hoVaten = sc.nextLine();
                String toLowerCase = hoVaten.toLowerCase();
                boolean flag = false;
                for (int i = 0; i < size; i++) {
                    if (toLowerCase.contains(nhanvien[i].getTen().toLowerCase())) {
                        nhanvien[i].Xuat();
                        flag = true;
                    }
                }
                if (flag == false)
                    System.out.println("Khong tim thay nhan vien");
                break;
            }
            case 3: {
                System.out.println("Nhap so CCCD cua nhan vien can tim: ");
                int cccd = Integer.parseInt(sc.nextLine());
                boolean flag = true;
                for (int i = 0; i < size; i++) {
                    if (cccd == nhanvien[i].getCCCD()) {
                        nhanvien[i].Xuat();
                        flag = true;
                    }
                }
                if (flag == false) {
                    System.out.println("Khong tim thay nhan vien");
                    break;
                }
            }
            case 0:
                break;
            default:
                System.out.println("Nhap sai thao tac, xin moi nhap lai");
        }
    }

    @Override
    public void docFile() {
        int i = 0;
        try {
            FileReader fr = new FileReader("DanhSachNhaNVien.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                String line = "";
                while (true) {
                    line = br.readLine();
                    if (line == null)
                        break;
                    String[] txt = line.split("\\|");
                    String id = txt[0];
                    String ten = txt[1];
                    String ngayString = txt[2];
                    Ngay NS = new Ngay(ngayString);
                    String gioiTinh = txt[3];
                    int CCCD = Integer.parseInt(txt[4]);
                    String chucVu = txt[5];
                    String maPhongBan = txt[6];
                    PhongBan phongBan = null;
                    double luong = Double.parseDouble(txt[7]);

                     switch (maPhongBan) {
                    case "KTHUAT":
                        phongBan = new KyThuat(maPhongBan);
                        break;
                    case "KTOAN":
                        phongBan = new KeToan(maPhongBan);
                        break;
                    case "MKT":
                        phongBan = new Marketing(maPhongBan);
                        break;
                }
                    
                nhanvien[i] = new NhanVien(id, ten, NS, gioiTinh, CCCD, chucVu, phongBan,luong);
                i++;
                }
            } finally {
                size = i;
                fr.close();
                br.close();
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void ghiFile() {
        try {
            FileWriter fw = new FileWriter("DaGhiFile.txt",false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < size; i++) {
                pw.println(nhanvien[i].getId() + "|"
                        + nhanvien[i].getTen() + "|"
                        + nhanvien[i].getNS().getNgaySinh() + "|"
                        + nhanvien[i].getGioiTinh() + "|"
                        + nhanvien[i].getCCCD() + "|"
                        + nhanvien[i].getChucVu()   + "|"
                        + nhanvien[i].getPhongBan().getMaPhongBan() + "|"
                        + nhanvien[i].getLuong()
                        );
            }
            bw.close();
        } catch (IOException e) {
        }
    }

    @Override
    public void menu(){
        docFile();
        int choice = 0;
        do{
            System.out.println("||============ Chon thao tac ===============||");
            System.out.println("||1. Them nhan vien moi                     ||");
            System.out.println("||2. Xuat danh sach nhan vien               ||");
            System.out.println("||3. Xoa nhan vien                          ||");
            System.out.println("||4. Sua nhan vien                          ||");
            System.out.println("||5. Tim nhan vien                          ||"); 
            System.out.println("||0. Quay lai                               ||");
            System.out.println("||==========================================||");
            System.out.print("Nhap thao tac: ");
        
        choice = Integer.parseInt(sc.nextLine());
        switch(choice) {
            case 1:{
                them();
                break;
            }
            case 2:{
                xuat();
                break;
            }
            case 3:{
                xoa();
                break;
            }
            case 4:{
                sua();
                break;
            }
            case 5:{
                timKiem();
                break;
            }
            
            case 0: break;
            default:
            System.out.println("Nhap sai thao tac, xin nhap lai !!!");
        }
    } while ( choice != 0);
}
     

}