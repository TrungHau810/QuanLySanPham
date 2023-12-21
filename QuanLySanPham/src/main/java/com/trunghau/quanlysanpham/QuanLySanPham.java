package com.trunghau.quanlysanpham;

import com.trunghau.quanlysanpham.thongtinsanpham.BangDia;
import com.trunghau.quanlysanpham.thongtinsanpham.Sach;
import com.trunghau.quanlysanpham.thongtinsanpham.SanPham;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Trung Hau
 */
public class QuanLySanPham {

    private List<SanPham> ds = new ArrayList<>();

    public void themSP(SanPham... p) {
        this.ds.addAll(Arrays.asList(p));
    }

    //i = 0 -> Nhap thong tin cua Sach
    //i = 1 -> Nhap thong tin cua Bang dia
    public void themSP(int i) {
        if (i == 0) {
            System.out.println("Nhap thong tin Sach");
            SanPham p = new Sach();
            p.nhapSP();
            this.ds.add(p);
        }
        if (i == 1) {
            System.out.println("Nhap thong tin Bang dia");
            SanPham p = new BangDia();
            p.nhapSP();
            this.ds.add(p);
        }
    }

//   Them SanPham vao List tu doc file
    public void themSP() throws FileNotFoundException {
        File f = new File("src/main/resources/Sach.txt");
        try(Scanner sc = new Scanner(f)) {
            while(sc.hasNext()) {
                this.ds.add(new Sach(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }
        }
    }
    public void themSP(String classPath) throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            IllegalArgumentException,
            InvocationTargetException {
        Class c = Class.forName(classPath);
        SanPham p = (SanPham) c.getConstructor().newInstance();
        p.nhapSP();
        this.ds.add(p);
    }

    public SanPham timKiem(int id) {
        return this.ds.stream().filter(s -> s.getIdProduct() == id).findFirst().get();
    }

    public List<SanPham> timKiem(String name) {
        return this.ds.stream().filter(s -> s.getNameProduct().equals(name)).collect(Collectors.toList());
    }

    public void xoaSP(int id) {
        this.ds.remove(timKiem(id));
    }

    public void sapXep() {
        this.ds.sort((s1, s2) -> {
            int p1 = s1.getPrice();
            int p2 = s2.getPrice();
            if (p1 < p2) {
                return 1;
            } else if (p1 > p2) {
                return -1;
            }
            return 0;
        });
    }

    public void hienThi() {
        this.ds.forEach(sp -> sp.hienThi());
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
