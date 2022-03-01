package bai5;

public class Nguoi {
    public String hoTen;
    public int tuoi;
    public int soCMND;

    public Nguoi(String hoTen, int tuoi, int soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", soCMND=" + soCMND +
                '}';
    }
}
