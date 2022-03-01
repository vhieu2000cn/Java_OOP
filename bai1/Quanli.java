package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quanli {
    public List<CanBo> listCanBo;

    public Quanli() {
        this.listCanBo = new ArrayList<>();
    }

    public void themCanBo(CanBo canBo){
        this.listCanBo.add(canBo);
    }
    public List<CanBo> timKiemTheoTen(String ten){
        return this.listCanBo.stream().filter(x->x.hoTen==ten).collect(Collectors.toList());
    }
    public void hienThongTin(){
        this.listCanBo.stream().forEach(System.out::println);
    }
//x.hoTen+"||"+x.diaChi+"||"+x.gioiTinh+"||"+x.tuoi
}
