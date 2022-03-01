package bai5;

public enum LoaiPhong {
    A(500),B(300),C(100);
    int price;

    LoaiPhong(int price) {
        this.price = price;
    }
}
