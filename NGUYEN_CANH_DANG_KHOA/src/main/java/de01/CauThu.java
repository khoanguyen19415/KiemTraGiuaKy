/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    private int soao;
    private String hoten;
    private int namsinh;
    private double luongcung;
    private double tienthuong;
    private double tienphat;

    public CauThu(int soao, String hoten, int namsinh, double luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public double getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }
    
     public double tinhLuongThucLanh() {
        return luongcung + tienthuong - tienphat;
    }
     public void xuat(){
         System.out.println("CauThu[Hoten:" + hoten + ",soao: " + soao +
                 ", namsinh: " + namsinh + ", luongcung: " + luongcung + ", tienthuong: " + tienthuong +
                 ", tienphat: " + tienphat + ", Luongthuclanh: "  + tinhLuongThucLanh());
     }
}
