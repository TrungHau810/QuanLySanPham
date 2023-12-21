package com.trunghau.quanlysanpham.thongtinsanpham;

/**
 *
 * @author Trung Hau
 */
public class SanPham {

    private int idProduct;
    private String nameProduct;
    private String description;
    private String producer;
    private int price;

    public SanPham() {
    }

    public SanPham(int idProduct, String nameProduct, String description, String producer, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.description = description;
        this.producer = producer;
        this.price = price;
    }

    public void nhapSP() {
        System.out.print("Ma san pham: ");
        this.idProduct = Integer.parseInt(CauHinh.sc.nextLine());
        System.out.print("Ten san pham: ");
        this.nameProduct = CauHinh.sc.nextLine();
        System.out.print("Mo ta san pham: ");
        this.description = CauHinh.sc.nextLine();
        System.out.print("Nha san xuat: ");
        this.producer = CauHinh.sc.nextLine();
        System.out.print("Ban gia: ");
        this.price = Integer.parseInt(CauHinh.sc.nextLine());
    }

    public void hienThi() {
        System.out.printf("Ma san pham: %d\nTen san pham: %s\nMo ta san pham: %s\nNha san xuat: %s\nGia ban: %d VND\n",
                this.idProduct,
                this.nameProduct,
                this.description,
                this.producer,
                this.price);
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the nameProduct
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * @param nameProduct the nameProduct to set
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * @param producer the producer to set
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
