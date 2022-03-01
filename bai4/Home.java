package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho kp = new KhuPho();
        while (true){
            System.out.println("1: nhap ho dan");
            System.out.println("2: hien thi ho dan");
            System.out.println("3: thoat");
            String num = sc.nextLine();
            switch (num) {
                case "1": {
                    System.out.println("so ho dan can nhap");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("so nha");
                        int soNha = sc.nextInt();
                        sc.nextLine();
                        List<Nguoi> thanhVien = new ArrayList<>();
                        while (true) {
                            System.out.println("ho ten");
                            String hoTen = sc.nextLine();
                            System.out.println("tuoi");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("nghe nghiep");
                            String ngheNghiep = sc.nextLine();
                            System.out.println("so cmnd");
                            int soCMND = sc.nextInt();
                            sc.nextLine();
                            thanhVien.add(new Nguoi(hoTen, tuoi, ngheNghiep, soCMND));
                            System.out.println("them nguoi");
                            if (sc.nextLine().equalsIgnoreCase("N")) {
                                break;
                            }
                        }
                        kp.themHoGiaDinh(new HoGiaDinh(thanhVien, soNha));
                    }
                    break;
                }
                case "2": {
                    kp.hienThi();
                    break;
                }
                case "3":{
                    return;
                }
            }
        }
    }
}
