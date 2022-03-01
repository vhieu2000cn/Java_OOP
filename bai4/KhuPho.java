package bai4;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    private List<HoGiaDinh> listHoGiadinh;

    public KhuPho() {
        this.listHoGiadinh = new ArrayList<>();
    }
    public void themHoGiaDinh(HoGiaDinh hoGiaDinh){
        this.listHoGiadinh.add(hoGiaDinh);
    }
    public void hienThi(){
        this.listHoGiadinh.forEach(System.out::println);
    }
}
