/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitaplon.model;

/**
 *
 * @author KimAnh
 */ 
public class SinhVien {
    private String MaSinhVien, HoTen, Email, SoDienThoai, DiaChi;
    private int GioiTinh;
    private byte [] HinhDaiDien;

    public SinhVien() {
    }

    public SinhVien(String MaSinhVien, String HoTen, String Email, String SoDienThoai, String DiaChi, int GioiTinh, byte[] HinhDaiDien) {
        this.MaSinhVien = MaSinhVien;
         this.HoTen = HoTen;
        this.Email = Email;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.HinhDaiDien = HinhDaiDien;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public byte[] getHinhDaiDien() {
        return HinhDaiDien;
    }

    public void setHinhDaiDien(byte[] HinhDaiDien) {
        this.HinhDaiDien = HinhDaiDien;
    }
    
}
