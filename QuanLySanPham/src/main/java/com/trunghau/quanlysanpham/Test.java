package com.trunghau.quanlysanpham;

import com.trunghau.quanlysanpham.thongtinsanpham.BangDia;
import com.trunghau.quanlysanpham.thongtinsanpham.CauHinh;
import com.trunghau.quanlysanpham.thongtinsanpham.Sach;
import com.trunghau.quanlysanpham.thongtinsanpham.SanPham;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Trung Hau
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException,
            InvocationTargetException,
            IllegalAccessException,
            NoSuchMethodException,
            FileNotFoundException {
        QuanLySanPham ds = new QuanLySanPham();
//        SanPham sp1 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                150000,
//                350);
//        SanPham sp2 = new BangDia(
//                (int) (Math.random() * 100000 + 1),
//                "Introduce",
//                "Gioi thieu so net ve Truong",
//                "PV. Nguyen Thi Thu Trang",
//                250000,
//                30);
//        SanPham sp3 = new BangDia(
//                (int) (Math.random() * 100000 + 1),
//                "OOP",
//                "so net ve Truong",
//                "Thu Trang",
//                550000,
//                35.6);
//        SanPham sp4 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                150000,
//                1500);
//        SanPham sp5 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                150000,
//                106);
//        SanPham sp6 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                150000);
//        SanPham sp7 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                150000,
//                4569);
//        SanPham sp8 = new Sach(
//                (int) (Math.random() * 100000 + 1),
//                "Lap trinh huong doi tuong",
//                "Giao trinh mon Lap trinh huong doi tuong. Truong DH Mo TP.HCM",
//                "Truong DH Mo TP.HCM",
//                50000,
//                235);
//        ds.themSP(sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8);
//        ds.themSP(0);
//        ds.themSP(1);
//        ds.themSP(0);
//        ds.themSP(1);
//        ds.themSP("com.trunghau.quanlysanpham.thongtinsanpham.Sach");
//        ds.themSP("com.trunghau.quanlysanpham.thongtinsanpham.BangDia");
        ds.themSP();
        ds.hienThi();
//        System.out.println("===TIM KIEM SAN PHAM THEO MA SAN PHAM===");
//        System.out.print("Nhap ma san pham can tim kiem: ");
//        String name = CauHinh.sc.nextLine();
//        ds.timKiem(name).forEach(s -> s.hienThi());
//        System.out.println("===SAP XEP GIAM DAN THEO GIA===");
//        ds.sapXep();
//        ds.hienThi();
        System.out.println("===XOA THEO MA SAN PHAM===");
        System.out.print("Nhap ID: ");
        int ma = CauHinh.sc.nextInt();
        ds.xoaSP(ma);
        ds.hienThi();
    }
}
