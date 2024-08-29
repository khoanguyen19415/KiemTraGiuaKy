/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        QLCauThu qlCauThu = new QLCauThu();
        int chon;

        do {
            System.out.println("\n---------MENU---------");
            System.out.println("1. Xuat danh sach cau thu");
            System.out.println("2. Them moi cau thu");
            System.out.println("3. Tim cau thu co luong cao nhat");
            System.out.println("4. Sap xep cau thu theo luong tang dan");
            System.out.println("5. Tinh luong cung trung binh");
            System.out.println("6. Thoat");
            System.out.print("hay chon tu(1->6): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    qlCauThu.xuatDanhSachCauThu();
                    break;
                case 2:
                    System.out.print("Nhap so ao: ");
                    int soao = sc.nextInt();

                    System.out.print("Nhap ho ten: ");
                    String hoten = sc2.nextLine();

                    System.out.print("Nhap nam sinh: ");
                    int namsinh = sc2.nextInt();

                    System.out.print("Nhap luong cung: ");
                    double luongcung = sc.nextDouble();

                    System.out.print("Nhap tien thuong: ");
                    double tienthuong = sc.nextDouble();

                    System.out.print("Nhap tien phat: ");
                    double tienphat = sc.nextDouble();

                    CauThu cauThu = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThu);
                    break;
                case 3:
                    ArrayList<CauThu> cauThuLuongCaoNhat = qlCauThu.CTLuongCaoNhat();
                    System.out.println("-------CAU THU CÓ LUONG CAO NHAT--------");
                    for (CauThu cauThu1 : cauThuLuongCaoNhat) {
                        cauThu1.xuat();
                    }
                    break;
                case 4:
                    qlCauThu.sapXepCauThuTheoLuong();
                    qlCauThu.xuatDanhSachCauThu();
                    break;
                case 5:
                    double luongCungTB = qlCauThu.tinhLuongCungTrungBinh();
                    System.out.println("Luong cung trung binh cua cac cau thu: " + luongCungTB);
                    break;
                case 6:
                    System.out.println("Goodbye! See you.");
                    break;
            }
        } while (chon != 0);
    }
}
