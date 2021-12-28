/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitaplon.dao;

import com.mycompany.baitaplon.helpers.DatabaseHelper;
import com.mycompany.baitaplon.model.NguoiDung;
import com.mycompany.baitaplon.model.SinhVien;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author KimAnh
 */
public class SinhVienDao {
    public boolean insert(SinhVienDao sv)
        throws Exception{
        
        String sql = "INSERT INTO [dbo].[SinhVien] ([MaSinhVien], [HoTen], [Email], [SoDienThoai], [GioiTinh], [DiaChi], [HinhDaiDien])" + 
                " VALUES(?,?,?,?,?,?,?)";
        try(
                  Connection con = DatabaseHelper.openConnection();
                  PreparedStatement pstmt = con.prepareStatement(sql);
            ) {
            pstmt.setString(1, sv.getMaSinhVien());
            pstmt.setString(2, sv.getHoTen());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSoDienThoai());
            pstmt.setString(5, sv.getGioiTinh());
            pstmt.setString(6,sv.getDiaChi());
            if (sv.getHinhDaiDien() != null) {
                Blob hinh = new SerialBlob((Blob) sv.getHinhDaiDien());
                pstmt.setBlob(6, hinh);
            }
            else {
                Blob hinh = null;
                pstmt.setBlob(6, hinh);
            }
            return pstmt.executeUpdate()>0;
        }       
    }
    public boolean update(SinhVien sv)    
        throws Exception {
        String sql = "UPDATE dbo.SinhVien" +
                " SET HoTen = ?, Email = ?, SoDienThoai =  ?, GioiTinh = ?, DiaChi = ?, HinhDaiDien = ?" +
                " where MaSinhVien = ?";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(7, sv.getMaSinhVien());
            pstmt.setString(1, sv.getHoTen());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSoDienThoai());
            pstmt.setInt(4, sv.getGioiTinh());
            pstmt.setString(5, sv.getDiaChi());
            if (sv.getHinhDaiDien() != null) {
                Blob hinh = new SerialBlob(sv.getHinhDaiDien());
                pstmt.setBlob(6, hinh);
            }
            else {
                Blob hinh = null;
                pstmt.setBlob(6, hinh);
            }
            return pstmt.executeUpdate()>0;
        }
    }
    
    public boolean delete (String maSinhVien) 
        throws Exception{
        String sql = "delete from sinh vien" +
                "where MaSinhVien = ?";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate()>0;
        }
    }
    
    public SinhVien findById(String maSinhVien)
        throws Exception{
            String sql = "select * from sinhvien where maSinhVien =";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, maSinhVien);
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                SinhVien sv = createSinhVien(rs);
                return sv;
            }
        }
        return null;
        }
    }

    private SinhVien createSinhVien(final ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString("masinhvien"));
        sv.setHoTen(rs.getString("hoten"));
        sv.setEmail(rs.getString("email"));
        sv.setSoDienThoai(rs.getString("soDienThoai"));
        sv.setDiaChi(rs.getString("diachi"));
        sv.setGioiTinh(rs.getInt("gioitinh"));
        Blob blob = rs.getBlob("hinhdaidien");
        if (blob != null) 
            sv.setHinhDaiDien(blob.getBytes(0, (int) blob.length()));
        return sv;
    }
    
    public List<SinhVien> findAll() 
        throws Exception{
            String sql = "select * from sinhvien";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            try(ResultSet rs = pstmt.executeQuery();) {
                List<SinhVien> list = new ArrayList<>();
                while (rs.next()) {
                    SinhVien sv = createSinhVien(rs);
                list.add(sv);
            }
            return list;
            }
        }
    }
    private String getMaSinhVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getHoTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSoDienThoai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getGioiTinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getHinhDaiDien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean insert(SinhVien sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDiaChi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
