package bai2;

import java.util.ArrayList;
import java.util.List;

enum LoaiTaiLieu{
    SACH,BAO,TAPCHI
}

public class QuanLiSach {
    private List<TaiLieu> listTaiLieu;

    public QuanLiSach() {
        this.listTaiLieu = new ArrayList<>();
    }
    public void themTaiLieu(TaiLieu taiLieu){
        this.listTaiLieu.add(taiLieu);
    }
    public void xoaTaiLieu(int maTaiLieu){
        this.listTaiLieu.removeIf(x->x.maTaiLieu==maTaiLieu);
    }
    public void hienThongTin(){
        this.listTaiLieu.forEach(x-> System.out.println(x.toString()));
    }
    public void timKiemTaiLieu(String  loaiTaiLieu){
        switch (loaiTaiLieu){
            case "sach":{
                listTaiLieu.stream().filter(x->x instanceof Sach).forEach(System.out::println);
            }
            case "bao":{
                listTaiLieu.stream().filter(x->x instanceof Bao).forEach(System.out::println);
            }
            case "tap chi":{
                listTaiLieu.stream().filter(x->x instanceof TapChi).forEach(System.out::println);
            }
        }
    }
}
