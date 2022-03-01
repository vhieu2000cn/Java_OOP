package bai5;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan ks = new KhachSan();
        while (true) {
            System.out.println("1: check in");
            System.out.println("2: check out");
            System.out.println("3: xoa khach theo cmnd");
            System.out.println("4: hien thong tin");
            System.out.println("5: thoat");
            switch (sc.nextLine()) {
                case "1": {
                    System.out.println("ho ten");
                    String hoTen = sc.nextLine();
                    System.out.println("tuoi");
                    int tuoi = sc.nextInt();
                    System.out.println("so cmnd");
                    int soCMND = sc.nextInt();
                    System.out.println("so ngay thue");
                    int soNgayThue = sc.nextInt();
                    sc.nextLine();
                    System.out.println("loai phong: A|B|C");
                    switch (sc.nextLine()){
                        case "a":{
                            ks.themNguoi(new Phong(LoaiPhong.A,new Nguoi(hoTen,tuoi,soCMND),soNgayThue));
                            break;
                        }
                        case "b":{
                            ks.themNguoi(new Phong(LoaiPhong.B,new Nguoi(hoTen,tuoi,soCMND),soNgayThue));
                            break;
                        }
                        case "c":{
                            ks.themNguoi(new Phong(LoaiPhong.C,new Nguoi(hoTen,tuoi,soCMND),soNgayThue));
                            break;
                        }
                        default:{
                            System.out.println("nhap sai loai phong");
                            return;
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.println("nhap so cmnd");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.println("so tien can thanh toan: "+ks.tinhTien(num));
                    break;
                }
                case "3":{
                    System.out.println("nhap so cmnd");
                    ks.xoaNguoi(sc.nextInt());
                    break;
                }
                case "4":{
                    ks.hienThongTin();
                    break;
                }
                case "5":{
                    return;
                }
            }
        }
    }
}
