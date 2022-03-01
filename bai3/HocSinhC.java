package bai3;

public class HocSinhC extends HocSinh{
    public static String van = "van";
    public static String su = "su";
    public static String dia = "dia";

    public HocSinhC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "HocSinhC"+"||"+soBaoDanh+"||"+hoTen+"||"+diaChi+"||"+"||"+mucUuTien;
    }
}
