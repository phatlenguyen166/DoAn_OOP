package doan_oop;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNhanVien nhanVien = new ListNhanVien();  nhanVien.docFile();
        ListDuAn duAn = new ListDuAn();
        ListHoaDon hoaDon = new ListHoaDon();
        ListChienDichMarketing chienDichMarketing = new ListChienDichMarketing();
        ThongKe tk =new ThongKe();
        int choice = 0;
        
        do {
            System.out.println("||============ Chon chuc nang ===============||");
            System.out.println("||1. Chon chuc nang nhan vien                ||");
            System.out.println("||2. Chon chuc nang du an                    ||");
            System.out.println("||3. Chon chuc nang hoa don                  ||");
            System.out.println("||4. Chon chuc nang chien dich Marketing     ||");
            System.out.println("||5. Chon chuc nang thong ke                 ||");
            System.out.println("||0. Quay lai                                ||");
            System.out.println("||===========================================||");
            System.out.print("Nhap thao tac: ");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: {
                    nhanVien.menu();
                    break;
                }
                case 2: {
                    duAn.menu();
                    break;
                }
                case 3: {
                    hoaDon.menu();
                    break;
                }
                case 4: {
                    chienDichMarketing.menu();
                    break;
                }
                case 5: 
                    tk.inputThongKe();
                    tk.outputThongKe();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhap sai thao tac, xin nhap lai !!!");
            }
        } while (choice != 0);
        sc.close();
    }
}
