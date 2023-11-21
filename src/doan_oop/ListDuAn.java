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
public class ListDuAn implements ThaoTac {

    public DuAn listDuAn[];
    private int numberOfProjects;
    static Scanner sc = new Scanner(System.in);

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public ListDuAn() {
        listDuAn = new DuAn[15];
        numberOfProjects = 0;
    }

    public void xemDsArray() {
        for (int i = 0; i < numberOfProjects; i++) {
            System.out.println(listDuAn[i]);
        }
    }

    @Override
    public void them() {
        DuAn p = new DuAn();
        System.out.println("+Nhap id se them:");
        String id = sc.nextLine();
        p.setIdDa(id);
        p.inputDuAn();
        //numberOfProjects++;
        listDuAn[numberOfProjects++] = p;
    }

    @Override
    public void sua() {
        System.out.println("+Nhap id du an can sua:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < numberOfProjects; i++) {
            if (test.equals(listDuAn[i].getIdDa().toLowerCase())) {
                DuAn p = new DuAn();
                p.inputDuAn();
                p.setIdDa(listDuAn[i].getIdDa());
                listDuAn[i] = p;
                check = true;
            }
        }
        if (check == false) {
            System.out.println("--Khong ton tai du lieu");
        }

    }

    @Override
    public void timKiem() {
        System.out.println("+Nhap ten du an can kiem:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < numberOfProjects; i++) {
            if (test.equals(listDuAn[i].getIdDa().toLowerCase())) {
                System.out.println(listDuAn[i].toString());
            }
        }
        if (check == false) {
            System.out.println("Khong ton tai du lieu");
        }

    }

    @Override
    public void xoa() {
        int num = -1;
        System.out.println("Nhap id du an can xoa:");
        String id = sc.nextLine();
        String test = id.toLowerCase();
        boolean check = false;
        for (int i = 0; i < numberOfProjects; i++) {
            if (test.equals(listDuAn[i].getIdDa().toLowerCase())) {
                check = true;
                num = i;
                break;
            }
        }
        if (check == true) {
            for (int i = num; i < listDuAn.length - 1; i++) {
                listDuAn[i] = listDuAn[i + 1];
            }

            numberOfProjects--;

            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong ton tai du lieu de xoa");
        }
    }

    public void addDuAn(DuAn duAn) {
        if (numberOfProjects < 100) {
            listDuAn[numberOfProjects++] = duAn;
        } else {
            System.out.println("Danh sach day");
        }
    }

    @Override
    public void docFile() {
        try {
            File file = new File("duAn.txt");
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    DuAn duAn = new DuAn();
                    String[] parts = line.split(",");
                    duAn.setIdDa(parts[0]);
                    duAn.setTenDuAn(parts[1]);
                    duAn.setNgayBatDau(parts[2]);
                    duAn.setNgayKetThuc(parts[3]);
                    duAn.setTongChiPhi(Double.parseDouble(parts[4]));

                    addDuAn(duAn);
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
            for (int i = 0; i < numberOfProjects; i++) {
                DuAn p = listDuAn[i];
                // Add a null check before accessing methods
                if (p != null) {
                   
                    writer.write(p.getIdDa() + "," + p.getTenDuAn() + "," + p.getNgayBatDau() + ","
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
            System.out.println("||1. Them du an moi                         ||");
            System.out.println("||2. Xuat danh sach du an                   ||");
            System.out.println("||3. Xoa du  an                             ||");
            System.out.println("||4. Sua du an                              ||");
            System.out.println("||5. Tim du an                              ||");
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



