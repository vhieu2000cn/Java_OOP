package bai3;

public class HocSinhB extends HocSinh {
    public static String toan = "toan";
    public static String hoa = "hoa";
    public static String sinh = "sinh";

    public HocSinhB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "HocSinhB"+"||"+soBaoDanh+"||"+hoTen+"||"+diaChi+"||"+"||"+mucUuTien;
    }
}
