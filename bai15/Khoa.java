package bai15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Khoa {
    public String tenKhoa;
    private List<SinhVien> listSv;

    public Khoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
        this.listSv = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        this.listSv.add(sv);
    }

    public Boolean sinhVienChinhQuy(int msv) {
        return listSv.stream().anyMatch(x -> x.getMaSV() == msv && !(x instanceof SinhVienTaiChuc));
    }

    public void hienThiDiemTB(int hocky) {
        this.listSv.forEach(x -> System.out.println(x.danhSachKq.get(hocky-1)));
    }

    public long soLuongSvCQ() {
        return this.listSv.stream().filter(x -> !(x instanceof SinhVienTaiChuc)).count();
    }

    public SinhVien svDiemCao() {
        return listSv.stream().max(Comparator.comparingInt(SinhVien::getDiemDauVao))
                .get();
    }

    public List<SinhVien> svTaiChuc(String dt) {
        return listSv.stream().filter(x -> x instanceof SinhVienTaiChuc && ((SinhVienTaiChuc) x).lienKetDaoTao.equalsIgnoreCase(dt))
                .collect(Collectors.toList());
    }

    public List<SinhVien> diemTbl8() {
        return listSv.stream().filter(x -> x.getDanhSachKq().get(x.getDanhSachKq().size() - 1) > 8)
                .collect(Collectors.toList());
    }

    //    public SinhVien svDtbCaoNhat(int ky){
//       listSv.sort(Comparator.comparingInt(x->x.getDanhSachKq().get(ky)));
//       return listSv.get(0);
//    }
    public SinhVien svDtbCaoNhat() {
        return listSv.stream().max(Comparator.comparingInt(SinhVien::diemTbCaoNhat))
                .get();
    }

    public void sapXepSvGiamdantheonam() {
        listSv.stream().sorted(Comparator.comparingInt(SinhVien::namSinh))
                .forEach(x-> System.out.println(x));
    }

    public void thongKeSv() {
        System.out.println("so sinh vien nam 2020: " + listSv.stream().filter(x -> x.namHoc.equalsIgnoreCase("2020")).count());
        System.out.println("so sinh vien nam 2019: " + listSv.stream().filter(x -> x.namHoc.equalsIgnoreCase("2019")).count());
        System.out.println("so sinh vien nam 2018: " + listSv.stream().filter(x -> x.namHoc.equalsIgnoreCase("2018")).count());
    }

}
