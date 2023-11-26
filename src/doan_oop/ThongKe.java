package doan_oop;

import java.util.Arrays;
import java.util.Scanner;

public class ThongKe {
    int slNV, slDA;
    double sumLuong=0;
    double maxLuong=0;
    NhanVien nvKeToan[] = new NhanVien[0];
    NhanVien nvKyThuat[]= new NhanVien[0];
    NhanVien nvMarketing[]= new NhanVien[0];
    NhanVien nvien[];
    static Scanner sc = new Scanner(System.in);

    public void menuThongKe() {
        System.out.println("||============ Chon thao tac thong ke ===============||");
        System.out.println("||1. So luong nhan vien trong cong ty                ||");
        System.out.println("||2. Danh sach nhan vien thuoc phong ke toan         ||");
        System.out.println("||3. Danh sach nhan vien thuoc phong ky thuat        ||");
        System.out.println("||4. Chon chuc nang chien dich Marketing             ||");
        System.out.println("||5. Danh sach nhan vien thuoc phong marketing       ||");
        System.out.println("||6. Tong luong cua tat ca nhan vien trong cong ty   ||");
        System.out.println("||7. Nhan vien co luong cao nhat                     ||");
        System.out.println("||0. Quay lai                                        ||");
        System.out.println("||===================================================||");
    }

    public void inputNvien(){
        ListNhanVien dsNV = new ListNhanVien();
        dsNV.docFile();
        slNV = dsNV.getSize();
        nvien=new NhanVien[slNV];
        for(int i=0; i< slNV; i++){
            nvien[i]=dsNV.nhanvien[i];
        }
    }
    public void inputThongKe() {
        inputNvien();
        int ktoan = 0, kthuat = 0, m = 0;
        for (int i = 0; i < slNV; i++) {
            if (nvien[i].getPhongBan().getMaPhongBan().equalsIgnoreCase("KTOAN")) {
                ktoan++;
                nvKeToan = Arrays.copyOf(nvKeToan, ktoan);
                nvKeToan[ktoan - 1] = nvien[i];  
            } else if (nvien[i].getPhongBan().getMaPhongBan().equalsIgnoreCase("KTHUAT")) {
                kthuat++;
                nvKyThuat = Arrays.copyOf(nvKyThuat, kthuat);
                nvKyThuat[kthuat - 1] = nvien[i];
            }
            else if (nvien[i].getPhongBan().getMaPhongBan().equalsIgnoreCase("MKT")) {
                m++;
                nvMarketing = Arrays.copyOf(nvMarketing, m);
                nvMarketing[m - 1] = nvien[i];
            }
            //tong luong cua tat ca cac nhan vien
            sumLuong += nvien[i].getLuong();
            //luong cao nhat
            if(maxLuong<nvien[i].getLuong()){
                maxLuong=nvien[i].getLuong();
            }
        }
        ListDuAn dsDA=new ListDuAn();
        dsDA.docFile();
        slDA=dsDA.getNumberOfProjects();
    }
    public NhanVien[] NVMaxLuong(){
        NhanVien tempt[] =new NhanVien[0];
        int j=0;
        for(int i=0;i<slNV;i++){
            if(nvien[i].getLuong()==maxLuong){
                j++;
                tempt = Arrays.copyOf(tempt, j);
                tempt[j-1]=nvien[i];
            }
        }
        return tempt;
    }
    
    public void outputThongKe(){
        int choice;
        inputThongKe();
        do{
            menuThongKe();
            System.out.println("Moi nhap lua chon");
            choice=Integer.parseInt(sc.nextLine());
            switch(choice){
                case 0: break;
                case 1: 
                    System.out.println("so luong nhan vien trong cong ty: "+slNV);
                    break;
                case 2: 
                    for(NhanVien x: nvKeToan){
                        x.Xuat();
                    }
                    break;
                case 3:
                    for(NhanVien y: nvKyThuat){
                        y.Xuat();
                    }
                    break;
                case 4:
                    for(NhanVien z: nvMarketing){
                        z.Xuat();
                    }
                    break;
                case 5: 
                    System.out.println("So du an cua cong ty: "+slDA);
                    break;
                case 6:
                    System.out.println("Tong luong: "+sumLuong);
                    break;
                case 7:
                    System.out.println("Nhan vien co luong cao nhat:");
                    for(NhanVien x: NVMaxLuong()){
                        x.Xuat();
                    }
                    break;
                    
                default: System.out.println("Lua chon khong hop le");
            }
        }while(choice!=0);  
    }

    public static void main(String[] args) {
        ThongKe tk = new ThongKe();
        tk.outputThongKe();
    }
}
