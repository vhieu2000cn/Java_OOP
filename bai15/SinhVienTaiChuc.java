package bai15;

import java.util.ArrayList;
import java.util.List;


public class SinhVienTaiChuc extends SinhVien {
    public String lienKetDaoTao;

    public SinhVienTaiChuc(int maSV, String hoTen, String ngayThangNamSinh, String namHoc, int diemDauVao, List<Integer> danhSachKq, String lienKetDaoTao) {
        super(maSV, hoTen, ngayThangNamSinh, namHoc, diemDauVao, danhSachKq);
        this.lienKetDaoTao = lienKetDaoTao;
    }

    @Override
    public String toString() {
        return "SinhVienTaiChuc{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", ngayThangNamSinh='" + ngayThangNamSinh + '\'' +
                ", namHoc='" + namHoc + '\'' +
                ", danhSachKq=" + danhSachKq +
                ", lienKetDaoTao='" + lienKetDaoTao + '\'' +
                '}';
    }
}
