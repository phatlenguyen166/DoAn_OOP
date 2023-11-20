package doan_oop;

import java.util.Scanner;



public class Menu {
    public static void main(String[] args){
        ListNhanVien nhanVien = new ListNhanVien();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("||============ Chon thao tac ===============||");
            System.out.println("||1. Chon chuc nang nhan vien               ||");
            System.out.println("||0. Quay lai                               ||");
            System.out.println("||==========================================||");
            System.out.print("Nhap thao tac: ");
        
        choice = Integer.parseInt(sc.nextLine());
        switch(choice) {
            case 1:{
                nhanVien.Menu();
                break;
            }
            case 0: break;
            default:
            System.out.println("Nhap sai thao tac, xin nhap lai !!!");
        }
    } while ( choice != 0);
    sc.close();
    }
}
