    import java.util.ArrayList;
import java.util.Scanner;

public class Nhom03_QuanLyThuVien {
    public static void main(String[] args) {
        ArrayList<Book> danhSachSach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        // Thêm sẵn sách mẫu để kiểm tra cho nhanh
        danhSachSach.add(new Book("S01", "Lap trinh Java", "Nguyen Van A", 10));
        danhSachSach.add(new Book("S02", "Cau truc du lieu", "Tran Thi B", 5));

        do {
            System.out.println("\n--- MENU QUẢN LÝ THƯ VIỆN TOÀN DIỆN ---");
            System.out.println("1. Thêm mới sách (Thành viên 2)");
            System.out.println("2. Hiển thị danh sách sách (Thành viên 2)");
            System.out.println("3. Tìm kiếm sách theo tên (Thành viên 3)");
            System.out.println("4. Xóa sách theo mã sách (Thành viên 3)");
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
                        danhSachSach.forEach((b) -> {
                            b.hienThiThongTin();
                });
                    }
                    break;

                case 3: // CHỨC NĂNG TÌM KIẾM CỦA NGƯỜI THỨ 3
                    System.out.print("Nhập tên sách cần tìm: ");
                    String tenTim = sc.nextLine();
                    boolean timThay = false;
                    System.out.println("\nKết quả tìm kiếm:");
                    for (Book b : danhSachSach) {
                        if (b.getTenSach().toLowerCase().contains(tenTim.toLowerCase())) {
                            b.hienThiThongTin();
                            timThay = true;
                        }
                    }
                    if (!timThay) System.out.println("=> Không tìm thấy sách có tên: " + tenTim);
                    break;
case 4: // CHỨC NĂNG XÓA CỦA NGƯỜI THỨ 3
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        if (danhSachSach.get(i).getMaSach().equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            System.out.println("=> Đã xóa thành công sách có mã: " + maXoa);
                            daXoa = true;
                            break;
                        }
                    }
                    if (!daXoa) System.out.println("=> Không tìm thấy mã sách phù hợp để xóa!");
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (chon != 0);
    }
}
