package com.example.myapplication;

import java.io.Serializable;

public class ThuocNam implements Serializable {
    private String TenKhoaHoc;
    private String TenThuong;
    private String DacTinh;
    private String MauLa;
    private String Congdung;
    private String DuoTinh;
    private String Hinh;

    public ThuocNam() {
    }

    public ThuocNam(String tenKhoaHoc, String tenThuong, String dacTinh, String mauLa, String congdung, String duoTinh, String hinh) {
        TenKhoaHoc = tenKhoaHoc;
        TenThuong = tenThuong;
        DacTinh = dacTinh;
        MauLa = mauLa;
        Congdung = congdung;
        DuoTinh = duoTinh;
        Hinh = hinh;
    }

    public String getTenKhoaHoc() {
        return TenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        TenKhoaHoc = tenKhoaHoc;
    }

    public String getTenThuong() {
        return TenThuong;
    }

    public void setTenThuong(String tenThuong) {
        TenThuong = tenThuong;
    }

    public String getDacTinh() {
        return DacTinh;
    }

    public void setDacTinh(String dacTinh) {
        DacTinh = dacTinh;
    }

    public String getMauLa() {
        return MauLa;
    }

    public void setMauLa(String mauLa) {
        MauLa = mauLa;
    }

    public String getCongdung() {
        return Congdung;
    }

    public void setCongdung(String congdung) {
        Congdung = congdung;
    }

    public String getDuoTinh() {
        return DuoTinh;
    }

    public void setDuoTinh(String duoTinh) {
        DuoTinh = duoTinh;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String hinh) {
        Hinh = hinh;
    }
}


