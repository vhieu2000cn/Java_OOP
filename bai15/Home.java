package bai15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tao khoa");
        System.out.println("Nhap ten khoa");
        Khoa khoa = new Khoa(sc.nextLine());
        while (true){
            System.out.println("1: Them sinh vien");
            System.out.println("2: Kiem tra sinh vien chinh quy");
            System.out.println("3: Danh sach diem trung theo hoc ki");
            System.out.println("4: So luong sinh vien chinh quy");
            System.out.println("5: Sinh vien diem co diem dau vao cao nhat khoa");
            System.out.println("6: Danh sach sinh vien tai chuc theo dia diem");
            System.out.println("7: Danh sach sinh vien diem trung binh lon hon 8");
            System.out.println("8: Sinh vien co diem trung binh cao nhat");
            System.out.println("9: Sap xep sinh vien giam dan theo nam");
            System.out.println("10: Thong ke luong sinh vien qua cac nam hoc 2020 -> 2018");
            System.out.println("11: Thoat chuong trinh");
            String num = sc.nextLine();
            switch (num){
                case "1":{
                    System.out.println("Sinh vien tai chuc? Y/N");
                    String sv = sc.nextLine();
                    if (sv.equalsIgnoreCase("N")){
                        System.out.println("Nhap ma sinh vien:");
                        int msv = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap Ho ten:");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap ngay thang nam sinh: dd//mm//YY");
                        String namSinh = sc.nextLine();
                        System.out.println("Nam hoc");
                        String namHoc = sc.nextLine();
                        System.out.println("Diem dau vao");
                        int diemDauVao = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap so hoc ki");
                        int n = sc.nextInt();
                        sc.nextLine();
                        List<Integer> listKQ = new ArrayList<>();
                        for (int i=1; i<=n;i++){
                            System.out.println("Nhap diem hoc ki so "+i);
                            int kq = sc.nextInt();
                            listKQ.add(kq);
                        }
                        khoa.themSinhVien(new SinhVien(msv,hoTen,namSinh,namHoc,diemDauVao,listKQ));
                        break;
                    }
                    else {
                        System.out.println("Nhap ma sinh vien:");
                        int msv = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap Ho ten:");
                        String hoTen = sc.nextLine();
                        System.out.println("Nhap ngay thang nam sinh: dd//mm//YY");
                        String namSinh = sc.nextLine();
                        System.out.println("Nam hoc");
                        String namHoc = sc.nextLine();
                        System.out.println("Diem dau vao");
                        int diemDauVao = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Noi lien ket dao tao");
                        String noiLk = sc.nextLine();
                        System.out.println("Nhap so hoc ki");
                        int n = sc.nextInt();
                        sc.nextLine();
                        List<Integer> listKQ = new ArrayList<>();
                        for (int i=1; i<=n;i++){
                            System.out.println("Nhap diem hoc ki so "+i);
                            int kq = sc.nextInt();
                            sc.nextLine();
                            listKQ.add(kq);
                        }
                        khoa.themSinhVien(new SinhVienTaiChuc(msv,hoTen,namSinh,namHoc,diemDauVao,listKQ,noiLk));
                        break;
                    }
                }
                case "2":{
                    System.out.println("Nhap ma sinh vien:");
                    int msv = sc.nextInt();
                    sc.nextLine();
                    if (khoa.sinhVienChinhQuy(msv)){
                        System.out.println("sinh vien chinh quy");
                    }else System.out.println("Khong la sinh vien chinh quy");
                    break;
                }
                case "3":{
                    System.out.println("Nhap vao hoc ki ");
                    int hocKi = sc.nextInt();
                    sc.nextLine();
                    khoa.hienThiDiemTB(hocKi);
                    break;
                }
                case "4":{
                    System.out.println("So luong sinh vien chinh quy: "+khoa.soLuongSvCQ());
                    break;
                }
                case "5":{
                    System.out.println("Sinh vien co diem dau vao cao nhat khoa");
                    System.out.println(khoa.svDiemCao());
                    break;
                }
                case "6":{
                    System.out.println("Nhap vao dia diem tai chuc");
                    String diaDiem = sc.nextLine();
                    System.out.println(khoa.svTaiChuc(diaDiem));
                    break;
                }
                case "7":{
                    System.out.println(khoa.diemTbl8());
                    break;
                }
                case "8":{
                    System.out.println(khoa.svDtbCaoNhat());
                    break;
                }
                case "9":{
                    khoa.sapXepSvGiamdantheonam();
                    break;
                }
                case "10":{
                    khoa.thongKeSv();
                    break;
                }
                case "11":{
                    return;
                }
                default:
                    System.out.println("Nhap sai gia tri");
            }
        }
    }
}
