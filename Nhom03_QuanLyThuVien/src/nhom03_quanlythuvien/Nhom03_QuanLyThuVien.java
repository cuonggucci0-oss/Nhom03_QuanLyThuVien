package nhom03_quanlythuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Nhom03_QuanLyThuVien {
    public static void main(String[] args) {
        ArrayList<Book> danhSachSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- MENU QUẢN LÝ THƯ VIỆN (Thành viên 2) ---");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // Xóa bộ đệm

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã sách: ");
                    String ma = sc.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tg = sc.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int sl = sc.nextInt();
                    
                    danhSachSach.add(new Book(ma, ten, tg, sl));
                    System.out.println("=> Thêm sách thành công!");
                    break;
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thư viện hiện chưa có quyển sách nào!");
                    } else {
                        System.out.println("\n--- DANH SÁCH SÁCH TRONG THƯ VIỆN ---");
                        for (Book b : danhSachSach) {
                            b.hienThiThongTin();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Đã thoát. Hãy quay lại Git Bash để nộp bài.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (chon != 0);
    }
}