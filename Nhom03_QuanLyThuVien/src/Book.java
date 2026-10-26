public class Book {
    private final String maSach;
    private final String tenSach;
    private final String tacGia;
    private final int soLuong;

    public Book(String maSach, String tenSach, String tacGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
    }

    public void hienThiThongTin() {
        System.out.println(maSach + " - " + tenSach + " - " + tacGia + " - SL: " + soLuong);
    }

    public String getTenSach() { return tenSach; }
    public String getMaSach() { return maSach; }
} 