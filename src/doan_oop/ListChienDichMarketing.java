package doan_oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ListChienDichMarketing implements ThaoTac {
    public ChienDichMarketing listChienDich[];
    private int amount;
    static Scanner sc = new Scanner(System.in);

    public int getAmount() {
        return amount;
    }

    public ListChienDichMarketing() {
        listChienDich = new ChienDichMarketing[15];
        amount = 0;
    }

    public void xemDsArray() {
        for (int i = 0; i < amount; i++) {
            System.out.println(listChienDich[i]);
        }
    }

    @Override
    public void them() {
        ChienDichMarketing p = new ChienDichMarketing();
        System.out.println("+Nhap id du an them:");
        String id = sc.nextLine();
        
        p.inputChienDich();
        //numberOfProjects++;
        listChienDich[amount++] = p;
    }

    @Override
    public void sua() {
        System.out.println("+Nhap id chien dich can sua:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < amount; i++) {
            if (test.equals(listChienDich[i].getIdChienDich().toLowerCase())) {
                ChienDichMarketing p = new ChienDichMarketing();
                p.inputChienDich();              
                listChienDich[i] = p;
                check = true;
            }
        }
        if (check == false) {
            System.out.println("--Khong ton tai du lieu--");
        }

    }

    @Override
    public void timKiem() {
        System.out.println("+Nhap ten chien dich can kiem:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < amount; i++) {
            if (test.equals(listChienDich[i].getTenChienDich().toLowerCase())) {
                System.out.println(listChienDich[i].toString());
            }
        }
        if (check == false) {
            System.out.println("Khong ton tai du lieu");
        }

    }

    @Override
    public void xoa() {
        int num = -1;
        System.out.println("Nhap id chien dich can xoa:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < amount; i++) {
            if (test.equals(listChienDich[i].getIdChienDich().toLowerCase())) {
                check = true;
                num = i;
                break;
            }
        }
        if (check == true) {
            for (int i = num; i < listChienDich.length - 1; i++) {
                listChienDich[i] = listChienDich[i + 1];
            }

            amount--;

            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong ton tai du lieu de xoa");
        }
    }

    public void addDuAn(ChienDichMarketing chienDich) {
        if (amount < 100) {
            listChienDich[amount++] = chienDich;
        } else {
            System.out.println("Danh sach day");
        }
    }

    @Override
    public void docFile() {
        try {
            File file = new File("chienDich.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    ChienDichMarketing m = new ChienDichMarketing();
                    String[] parts = line.split(",");
                    m.setIdChienDich(parts[0]);
                    m.setTenChienDich(parts[1]);
                    //(String id, String ten, Ngay NS,String gioiTinh,int CCCD, String chucVu,PhongBan phongBan,double luong
                    //id nhan vien leader  
                    m.setIdLeader(parts[2]);
                    m.setNgayKetThuc(parts[3]);
                    m.setTongChiPhi(Double.parseDouble(parts[4]));

                    addDuAn(m);
                }
                reader.close();
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("docxong");
    }

    @Override
    public void ghiFile() {
        try {           
            FileWriter writer = new FileWriter("dsDuAn.txt");
            for (int i = 0; i < amount; i++) {
                ChienDichMarketing p = listChienDich[i];
                // Add a null check before accessing methods
                if (p != null) {
                   
                    writer.write(p.getIdChienDich() + "," + p.getTenChienDich() + ","+p.getIdLeader()  +","+ p.getNgayBatDau() + ","
                            + p.getNgayKetThuc() + "," + p.getTongChiPhi() + "\n");
                } else {
                    System.out.println(" DuAn  " + i + " null.");
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void xuat() {
        xemDsArray();
    }

    @Override
    public void menu() {
        docFile();
        int choice = 0;
        do {
            System.out.println("||============ Chon thao tac ===============||");
            System.out.println("||1. Them chien dich moi                    ||");
            System.out.println("||2. Xuat danh sach chien dich              ||");
            System.out.println("||3. Xoa chien dich                         ||");
            System.out.println("||4. Sua chien dich                         ||");
            System.out.println("||5. Tim chien dich                         ||");
            System.out.println("||0. Quay lai                               ||");
            System.out.println("||==========================================||");
            System.out.print("Nhap thao tac: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    them();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    xoa();
                    break;
                }
                case 4: {
                    sua();
                    break;
                }
                case 5: {
                    timKiem();
                    break;
                }
                case 0:{
                    ghiFile();
                    break;
                }
                default:
                    System.out.println("Nhap sai thao tac, xin nhap lai !!!");
            }
        } while (choice != 0);
    }

}


