package bai3;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh {
    private List<HocSinh> listHocSinh;
    public TuyenSinh(){
        this.listHocSinh = new ArrayList<>();
    }
    public void themHocSinh(HocSinh hocSinh){
        this.listHocSinh.add(hocSinh);
    }
    public void hienThongTin(){
        listHocSinh.stream().forEach(System.out::println);
    }
    public void timKiemTheoSBD(int sbd){
        listHocSinh.stream().filter(x->x.soBaoDanh == sbd).forEach(System.out::println);
    }
}
