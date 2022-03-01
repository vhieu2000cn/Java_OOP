package bai3;

import bai2.Bao;
import bai2.QuanLiSach;
import bai2.Sach;
import bai2.TapChi;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ql = new TuyenSinh();
        while (true) {
            System.out.println("Chon chuc nang");
            System.out.println("1: Them hoc sinh");
            System.out.println("2: Hien thong tin hoc sinh");
            System.out.println("3: Tim kiem theo so bao danh");
            System.out.println("4: thoat");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1: {
                    System.out.println("1: Hoc sinh A");
                    System.out.println("2: Hoc sinh B");
                    System.out.println("3: Hoc sinh C");
                    switch (sc.nextLine()) {
                        case "1": {
                            System.out.println("So bao danh:");
                            int soBaoDanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ho ten:");
                            String hoTen = sc.nextLine();
                            System.out.println("Dia chi:");
                            String diaChi = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Muc uu tien:");
                            int mucUuTien = sc.nextInt();
                            ql.themHocSinh(new HocSinhA(soBaoDanh,hoTen,diaChi,mucUuTien));
                            break;
                        }
                        case "2": {
                            System.out.println("So bao danh:");
                            int soBaoDanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ho ten:");
                            String hoTen = sc.nextLine();
                            System.out.println("Dia chi:");
                            String diaChi = sc.nextLine();
                            System.out.println("Muc uu tien:");
                            int mucUuTien = sc.nextInt();
                            ql.themHocSinh(new HocSinhB(soBaoDanh,hoTen,diaChi,mucUuTien));
                            break;
                        }
                        case "3": {
                            System.out.println("So bao danh:");
                            int soBaoDanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ho ten:");
                            String hoTen = sc.nextLine();
                            System.out.println("Dia chi:");
                            String diaChi = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Muc uu tien:");
                            int mucUuTien = sc.nextInt();
                            ql.themHocSinh(new HocSinhC(soBaoDanh,hoTen,diaChi,mucUuTien));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    ql.hienThongTin();
                    break;
                }
                case 3: {
                    System.out.println("Nhap so bao danh:");
                    int sbd = sc.nextInt();
                    sc.nextLine();
                    ql.timKiemTheoSBD(sbd);
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
