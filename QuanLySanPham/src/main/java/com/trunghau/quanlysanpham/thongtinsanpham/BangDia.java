package com.trunghau.quanlysanpham.thongtinsanpham;

/**
 *
 * @author Trung Hau
 */
public class BangDia extends SanPham {

    private double thoiLuong;

    public BangDia() {
    }

    public BangDia(int idProduct, String nameProduct, String description, String producer, int price, double thoiLuong) {
        super(idProduct, nameProduct, description, producer, price);
        this.thoiLuong = thoiLuong;
    }

    @Override
    public void nhapSP() {
        super.nhapSP();
        System.out.print("Thoi luong (phut): ");
        this.thoiLuong = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.println("---------------------------------------");
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Thoi luong: %.0f phut\n---------------------------------------\n", this.thoiLuong);

    }

    /**
     * @return the thoiLuong
     */
    public double getThoiLuong() {
        return thoiLuong;
    }

    /**
     * @param thoiLuong the thoiLuong to set
     */
    public void setThoiLuong(double thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
}
