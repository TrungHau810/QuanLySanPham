package com.trunghau.quanlysanpham.thongtinsanpham;

/**
 *
 * @author Trung Hau
 */
public class Sach extends SanPham {

    private int numberPage;

    public Sach() {
    }

    public Sach(int idProduct, String nameProduct, String description, String producer, int price, int numberPage) {
        super(idProduct, nameProduct, description, producer, price);
        this.numberPage = numberPage;
    }

    @Override
    public void nhapSP() {
        super.nhapSP();
        System.out.print("So trang: ");
        this.numberPage = Integer.parseInt(CauHinh.sc.nextLine());
        System.out.println("---------------------------------------");
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So trang: %d trang\n---------------------------------------\n", this.numberPage);
    }

    /**
     * @return the numberPage
     */
    public int getNumberPage() {
        return numberPage;
    }

    /**
     * @param numberPage the numberPage to set
     */
    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

}
