package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KhachSan {
    public List<Phong> listPhong;

    public KhachSan() {
        this.listPhong = new ArrayList<>();
    }

    public void themNguoi(Phong phong) {
        this.listPhong.add(phong);
    }

    public void xoaNguoi(int soCMND) {
        this.listPhong.removeIf(x->x.nguoi.soCMND == soCMND);
    }

    public int tinhTien(int soCMND) {
        Optional<Phong> n = this.listPhong.stream().filter(x -> x.nguoi.soCMND == soCMND).findFirst();
        if (n.isPresent()){
            return n.get().ngayThue * n.get().loaiPhong.price;
        }
        return 0;
    }
    public void hienThongTin(){
        this.listPhong.forEach(System.out::println);
    }
}
