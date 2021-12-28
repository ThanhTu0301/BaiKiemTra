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
public class BangDiem {
    private int ma;
    private String MaSinhVien;
    private float NhapMonCoSoDuLieu, JavaCoBan, ToanRoiRac;

    public BangDiem() {
    }

    public BangDiem(int ma, String MaSinhVien, float NhapMonCoSoDuLieu, float JavaCoBan, float ToanRoiRac) {
        this.ma = ma;
        this.MaSinhVien = MaSinhVien;
        this.NhapMonCoSoDuLieu = NhapMonCoSoDuLieu;
        this.JavaCoBan = JavaCoBan;
        this.ToanRoiRac = ToanRoiRac;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public float getNhapMonCoSoDuLieu() {
        return NhapMonCoSoDuLieu;
    }

    public void setNhapMonCoSoDuLieu(float NhapMonCoSoDuLieu) {
        this.NhapMonCoSoDuLieu = NhapMonCoSoDuLieu;
    }

    public float getJavaCoBan() {
        return JavaCoBan;
    }

    public void setJavaCoBan(float JavaCoBan) {
        this.JavaCoBan = JavaCoBan;
    }

    public float getToanRoiRac() {
        return ToanRoiRac;
    }

    public void setToanRoiRac(float ToanRoiRac) {
        this.ToanRoiRac = ToanRoiRac;
    }
    
}
        