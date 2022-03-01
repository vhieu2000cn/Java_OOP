package bai2;


import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLiSach ql = new QuanLiSach();
        while (true){
            System.out.println("Chon chuc nang");
            System.out.println("1: Them tai lieu");
            System.out.println("2: Xoa tai lieu");
            System.out.println("3: Hien thi thong tin tai lieu");
            System.out.println("4: tim kiem tai lieu");
            System.out.println("5: thoat");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:{
                    System.out.println("1: Sach");
                    System.out.println("2: Tap chi");
                    System.out.println("3: Bao");
                    switch (sc.nextLine()){
                        case "1":{
                            System.out.println("Ma tai lieu:");
                            int maTaiLieu =  sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nha xuat ban:");
                            String nhaXuatBan = sc.nextLine();
                            System.out.println("So ban phat hanh:");
                            int soBanPhatHanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ten tac gia:");
                            String tenTacGia = sc.nextLine();
                            System.out.println("soTrang:");
                            int soTrang= sc.nextInt();
                            ql.themTaiLieu(new Sach(maTaiLieu,nhaXuatBan,soBanPhatHanh,tenTacGia,soTrang));
                            break;
                        }
                        case "2":{
                            System.out.println("Ma tai lieu:");
                            int maTaiLieu =  sc.nextInt();
                            System.out.println("Nha xuat ban:");
                            String nhaXuatBan = sc.nextLine();
                            sc.nextLine();
                            System.out.println("So ban phat hanh:");
                            int soBanPhatHanh = sc.nextInt();
                            System.out.println("So ban phat hanh:");
                            int soPhatHanh = sc.nextInt();
                            System.out.println("thangPhatHanh:");
                            int thanPhatHanh= sc.nextInt();
                            ql.themTaiLieu(new TapChi(maTaiLieu,nhaXuatBan,soBanPhatHanh,soPhatHanh,thanPhatHanh));
                            break;
                        }
                        case "3":{
                            System.out.println("Ma tai lieu:");
                            int maTaiLieu =  sc.nextInt();
                            System.out.println("Nha xuat ban:");
                            String nhaXuatBan = sc.nextLine();
                            sc.nextLine();
                            System.out.println("So ban phat hanh:");
                            int soBanPhatHanh = sc.nextInt();
                            System.out.println("Ngay phat hanh:");
                            int ngayPhatHanh = sc.nextInt();
                            ql.themTaiLieu(new Bao(maTaiLieu,nhaXuatBan,soBanPhatHanh,ngayPhatHanh));
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("nhap ma tai lieu can xoa");
                    int maTaiLieu = sc.nextInt();
                    ql.xoaTaiLieu(maTaiLieu);
                    break;
                }
                case 3:{
                    ql.hienThongTin();
                    break;
                }
                case 4:{
                    System.out.println("nhap loai tai lieu");
                    String loaiTailieu = sc.nextLine();
                    ql.timKiemTaiLieu(loaiTailieu);
                    break;
                }
                case 5:{
                    return;
                }
            }
        }
    }
}
