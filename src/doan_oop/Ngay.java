/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doan_oop;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ngay {
    private int date;
    private int month;
    private int year;
    
    static Scanner sc = new Scanner(System.in);
    
    public Ngay() {
        date = 0;
        month = 0;
        year = 0;
    }

    public Ngay(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    
    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void setSc(Scanner sc) {
        Ngay.sc = sc;
    }
    public void Nhap() {
    
    System.out.print("Nhap ngay: ");
    setDate(Integer.parseInt(sc.nextLine()));

    System.out.print("Nhap thang: ");
    setMonth(Integer.parseInt(sc.nextLine()));

    System.out.print("Nhap nam: ");
    setYear(Integer.parseInt(sc.nextLine()));
}

    
    
    
    
    
    
}
