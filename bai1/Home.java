package bai1;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quanli ql = new Quanli();
        while (true){
            System.out.println("Chon chuc nang");
            System.out.println("1: Them can bo");
            System.out.println("2: Tim kiem theo ten");
            System.out.println("3: Hien thi danh sach can bo");
            System.out.println("4: thoat");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:{
                    System.out.println("1: Cong nhan");
                    System.out.println("2: Ky su");
                    System.out.println("3: Nhan vien");
                    switch (sc.nextLine()){
                        case "1":{
                            System.out.println("Ho ten:");
                            String hoTen =  sc.nextLine();
                            System.out.println("tuoi:");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("gioi tinh:");
                            String gioiTinh = sc.nextLine();
                            System.out.println("đia chi:");
                            String diaChi = sc.nextLine();
                            System.out.println("bac:");
                            int bac= sc.nextInt();
                            ql.themCanBo(new CongNhan(hoTen,tuoi,gioiTinh,diaChi,bac));
                            break;
                        }
                        case "2":{
                            System.out.println("Ho ten:");
                            String hoTen =  sc.nextLine();
                            System.out.println("tuoi:");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("gioi tinh:");
                            String gioiTinh = sc.nextLine();
                            System.out.println("đia chi:");
                            String diaChi = sc.nextLine();
                            System.out.println("nganh dao tao:");
                            String nganhDaoTao = sc.nextLine();
                            ql.themCanBo(new KySu(hoTen,tuoi,gioiTinh,diaChi,nganhDaoTao));
                            break;
                        }
                        case "3":{
                            System.out.println("Ho ten:");
                            String hoTen =  sc.nextLine();
                            System.out.println("tuoi:");
                            int tuoi = sc.nextInt();
                            sc.nextLine();
                            System.out.println("gioi tinh:");
                            String gioiTinh = sc.nextLine();
                            System.out.println("đia chi:");
                            String diaChi = sc.nextLine();
                            System.out.println("cong viec:");
                            String congViec = sc.nextLine();
                            ql.themCanBo(new NhanVien(hoTen,tuoi,gioiTinh,diaChi,congViec));
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("nhap ho ten");
                    String hoTen = sc.nextLine();
                    ql.timKiemTheoTen(hoTen).stream().forEach(System.out::println);
                    break;
                }
                case 3:{
                    ql.hienThongTin();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }
    }
}
