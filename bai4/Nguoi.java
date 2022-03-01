package bai4;

public class Nguoi {
    public String hoTen;
    public int tuoi;
    public String ngheNghiep;
    public int soCMND;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, int soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", soCMND=" + soCMND +
                '}';
    }
}
