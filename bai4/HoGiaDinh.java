package bai4;

import java.util.List;

public class HoGiaDinh {
    public List<Nguoi> listThanhVien;
    public int soNha;

    public HoGiaDinh(List<Nguoi> listThanhVien, int soNha) {
        this.listThanhVien = listThanhVien;
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "listThanhVien=" + listThanhVien +
                ", soNha=" + soNha +
                '}';
    }
}
