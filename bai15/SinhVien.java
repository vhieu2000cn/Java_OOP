package bai15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SinhVien {
    protected int maSV;
    protected String hoTen;
    protected String ngayThangNamSinh;
    protected String namHoc;
    private int diemDauVao;
    protected List<Integer> danhSachKq;

    public SinhVien(int maSV, String hoTen, String ngayThangNamSinh, String namHoc, int diemDauVao, List<Integer> danhSachKq) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.namHoc = namHoc;
        this.diemDauVao = diemDauVao;
        this.danhSachKq = danhSachKq;
    }

    public int diemTbCaoNhat() {
        int diem = 0;
        for (int i = 0; i <= danhSachKq.size()-1; i++) {
            if (danhSachKq.get(i).compareTo(diem) > 0) {
                diem = danhSachKq.get(i);
            }
        }
        return diem;
    }

    public int namSinh() {
        return Integer.parseInt(this.ngayThangNamSinh.substring(this.ngayThangNamSinh.length() - 4));
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public int getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(int diemDauVao) {
        this.diemDauVao = diemDauVao;
    }

    public List<Integer> getDanhSachKq() {
        return danhSachKq;
    }

    public void setDanhSachKq(ArrayList<Integer> danhSachKq) {
        this.danhSachKq = danhSachKq;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", ngayThangNamSinh='" + ngayThangNamSinh + '\'' +
                ", namHoc='" + namHoc + '\'' +
                ", diemDauVao=" + diemDauVao +
                ", danhSachKq=" + danhSachKq +
                '}';
    }
}
