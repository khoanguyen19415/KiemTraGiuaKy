/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;


/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QLCauThu {
    static ArrayList<CauThu> DSCauThu = new ArrayList<>();

 
    public QLCauThu() {
         DSCauThu = new ArrayList<>();
      
         DSCauThu.add(new CauThu(1, "nguyen canh dang khoa", 1995, 1000000, 500, 100));
         DSCauThu.add(new CauThu(2, "Le hoang huan", 1994, 1500000, 300000, 50000));
         DSCauThu.add(new CauThu(3, "tran thi chung", 1992, 2000000, 400000, 75000));
         DSCauThu.add(new CauThu(4, "nguyen van lai", 1996, 1200000, 350000, 25000));
         DSCauThu.add(new CauThu(5, "hoang ngoc hieu", 1993, 1300000, 600000, 150000));
         DSCauThu.add(new CauThu(6, "nguyen quoc dung", 1990, 1700000, 450000, 60000));
         DSCauThu.add(new CauThu(7, "pham van an", 1997, 1800000, 500000, 40000));
         DSCauThu.add(new CauThu(8, "nguyen van an", 1998, 1400000, 200000, 20000));
         DSCauThu.add(new CauThu(9, "le hoang hieu", 1995, 1600000, 550000, 80000));
         DSCauThu.add(new CauThu(10, "bui tan hoang", 1991, 2100000, 450000, 110000));
         DSCauThu.add(new CauThu(11, "le bao lam", 1999, 1550000, 300000, 70000));
    }

   
    public boolean themCauThu(CauThu cauThu) {
        for (CauThu ct :  DSCauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("So ao đa ton tai! Khong the them cau thu.");
                return false;
            }
        }
        DSCauThu.add(cauThu);
        System.out.println("Them cau thu thanh cong!");
        return true;
    }

  
    public void xuatDanhSachCauThu() {
        double tongLuong = 0;
        System.out.println("--------DANH SACH CAU THU---------");
        for (CauThu cauThu : DSCauThu) {
            cauThu.xuat();
            System.out.println("-------------------------");
            tongLuong += cauThu.tinhLuongThucLanh();
        }
        System.out.println("Tong luong CLB phai tra: " + tongLuong);
    }

    
    public ArrayList<CauThu> CTLuongCaoNhat() {
        ArrayList<CauThu> caoNhat = new ArrayList<>();
        double maxLuong = 0;
        for (CauThu cauThu : DSCauThu) {
            double luong = cauThu.tinhLuongThucLanh();
            if (luong > maxLuong) {
                maxLuong = luong;
                caoNhat.clear();
                caoNhat.add(cauThu);
            } else if (luong == maxLuong) {
                caoNhat.add(cauThu);
            }
        }
        return caoNhat;
    }
 
    public void sapXepCauThuTheoLuong() {
        Comparator<CauThu> cmp = new Comparator<CauThu>() {
            @Override
            public int compare(CauThu ct1, CauThu ct2) {
                return Double.compare(ct1.tinhLuongThucLanh(), ct2.tinhLuongThucLanh());

            }
        };  
        Collections.sort(DSCauThu,cmp);
        xuatDanhSachCauThu();
    }

   
    public double tinhLuongCungTrungBinh() {
        double tongLuongCung = 0;
        for (CauThu cauThu : DSCauThu) {
            tongLuongCung += cauThu.getLuongcung();
        }
        return tongLuongCung / DSCauThu.size();
    }
}

