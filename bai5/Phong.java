package bai5;

import java.util.List;

public class Phong {
    public LoaiPhong loaiPhong;
    public Nguoi nguoi;
    public int ngayThue;

    public Phong(LoaiPhong loaiPhong, Nguoi nguoi, int ngayThue) {
        this.loaiPhong = loaiPhong;
        this.nguoi = nguoi;
        this.ngayThue = ngayThue;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "loaiPhong=" + loaiPhong +
                ", nguoi=" + nguoi +
                ", ngayThue=" + ngayThue +
                '}';
    }
}
