/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ListHoaDon implements ThaoTac {
    public HoaDon listHoaDon[];
    private int amount;
    static Scanner sc = new Scanner(System.in);

    public int getAmount() {
        return amount;
    }

    public ListHoaDon() {
        listHoaDon = new HoaDon[15];
        amount = 0;
    }

    public void xemDsArray() {
        for (int i = 0; i < amount; i++) {
            System.out.println(listHoaDon[i]);
        }
    }

    @Override
    public void them() {
        HoaDon p = new HoaDon();      
        p.inputHoaDon();
        
        listHoaDon[amount++] = p;
    }

    @Override
    public void sua() {
        System.out.println("+Nhap id du an can sua:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < amount; i++) {
            if (test.equals(listHoaDon[i].getIdHoaDon().toLowerCase())) {
                HoaDon p = new HoaDon();
                p.inputHoaDon();               
                listHoaDon[i] = p;
                check = true;
            }
        }
        if (check == false) {
            System.out.println("--Khong ton tai du lieu");
        }

    }

    @Override
    public void timKiem() {
        System.out.println("||============ Chon thao tac tim kiem ===============||");
        System.out.println("||1. Tim hoa don theo ID                             ||");
        System.out.println("||2. Tim hoa don theo ten                            ||");
        System.out.println("||3. Tim nguoi ky theo ten                           ||");
        System.out.println("||0. Quay lai                                        ||");
        System.out.println("||===================================================||");
        System.out.print("Nhap thao tac : ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1: {
                System.out.println("Nhap ID hoa don can tim: ");
                String ID = sc.nextLine();
                String toLowerCase = ID.toLowerCase();
                boolean flag = false;
                for (int i = 0; i < amount; i++) {
                    if (toLowerCase.equals(listHoaDon[i].getIdHoaDon().toLowerCase())) {
                        System.out.println(listHoaDon[i].toString());
                        flag = true;
                    }
                }
                if (flag == true) {
                    System.out.println("Khong tim thay hoa don");
                }
                break;
            }
            case 2: {
                System.out.println("Nhap ten hoa don can tim kiem: ");
                String ten = sc.nextLine();
                String toLowerCase = ten.toLowerCase();
                boolean flag = false;
                for (int i = 0; i < amount; i++) {
                    if (toLowerCase.indexOf(listHoaDon[i].getTenHoaDon().toLowerCase())!=-1) {
                        System.out.println(listHoaDon[i].toString());
                        flag = true;
                    }
                }
                if (flag == false)
                    System.out.println("Khong tim thay hoa don");
                break;
            }
            case 3: {
                System.out.println("Nhap ten nguoi ky hoa don: ");
                String ten = sc.nextLine();
                String toLowerCase = ten.toLowerCase();
                boolean flag = true;
                for (int i = 0; i < amount; i++) {
                    if (toLowerCase.indexOf(listHoaDon[i].getTenHoaDon().toLowerCase())!= -1) {
                        System.out.println(listHoaDon[i].toString());
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
    public void xoa() {
        int num = -1;
        System.out.println("Nhap id hoa don can xoa:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < amount; i++) {
            if (test.equals(listHoaDon[i].getIdHoaDon().toLowerCase())) {
                check = true;
                num = i;
                break;
            }
        }
        if (check == true) {
            for (int i = num; i < listHoaDon.length - 1; i++) {
                listHoaDon[i] = listHoaDon[i + 1];
            }

            amount--;

            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong ton tai du lieu de xoa");
        }
    }

    public void addHoaDon(HoaDon hoaDon) {
        if (amount < 20) {
            listHoaDon[amount++] = hoaDon;
        } else {
            System.out.println("Danh sach day");
        }
    }

    @Override
    public void docFile() {
        try {
            File file = new File("hoaDon.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    HoaDon hoaDon = new HoaDon();
                    String[] parts = line.split(",");
                    hoaDon.setIdHoaDon(parts[0]);
                    hoaDon.setTenHoaDon(parts[1]);
                    hoaDon.setNguoiKy(parts[2]);
                    // 3 ngay 4 thang 5 nam
                    Ngay date= new Ngay();
                    date.setDate(Integer.parseInt(parts[3]));
                    date.setMonth(Integer.parseInt(parts[4]));
                    date.setYear(Integer.parseInt(parts[5]));
                    hoaDon.setNgayGhi(date);
                    hoaDon.setTongChiPhi(Double.parseDouble(parts[6]));
                    addHoaDon(hoaDon);
                }
                reader.close();
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("doc xong");
    }

    @Override
    public void ghiFile() {
        try {           
            FileWriter writer = new FileWriter("dsHoaDon.txt");
            for (int i = 0; i < amount; i++) {
                HoaDon p = listHoaDon[i];
                // Add a null check before accessing methods
                if (p != null) {
                   
                    writer.write(p.getIdHoaDon() + "," + p.getTenHoaDon() + "," + p.getNgayGhi() + ","
                            + p.getNguoiKy() + "," + p.getTongChiPhi() + "\n");
                } else {
                    System.out.println(" DuAn  " + i + " null.");
                }
            }
            writer.close();
        } catch (IOException e) {
           
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
            System.out.println("||1. Them HoaDon moi                        ||");
            System.out.println("||2. Xuat danh sach hoa don                 ||");
            System.out.println("||3. Xoa hoa don                            ||");
            System.out.println("||4. Sua hoa do                             ||");
            System.out.println("||5. Tim hoa don                            ||");
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
