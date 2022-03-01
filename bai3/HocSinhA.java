package bai3;

public class HocSinhA extends HocSinh {
    public static String toan = "toan";
    public static String ly = "ly";
    public static String hoa = "hoa";

    public HocSinhA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "HocSinhA"+"||"+soBaoDanh+"||"+hoTen+"||"+diaChi+"||"+"||"+mucUuTien;
    }
}
