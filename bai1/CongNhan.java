package bai1;

public class CongNhan extends CanBo {
    public int bac;
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi,int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
}
