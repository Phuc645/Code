package com.hsu.lab06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhsachShippers {
    ArrayList<Shippers> dsShipper = new ArrayList<>();

    public DanhsachShippers() {
    }

    public ArrayList<Shippers> getDsShipper() {
        return dsShipper;
    }

    public void setDsShipper(ArrayList<Shippers> dsShipper) {
        this.dsShipper = dsShipper;
    }

    @SuppressWarnings("resource")
    public void addShipper() {
        Shippers sp = new Shippers();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ID cua Shipper: ");
        sp.setShipperID(sc.nextInt());
        System.out.format("Nhap ten cong ty: ");
        sp.setCompanyName(sc0.nextLine());
        System.out.format("Nhap so dien thoai: ");
        sp.setPhone(sc0.nextLine());
        dsShipper.add(sp);
    }

    public void Output() {
        System.out.format("%-20s%-20s%-20s\n", "ID Shipper", "Ten Cong Ty", "SDT");
        for (Shippers ship : dsShipper) {
            System.out.format(ship.toString());
        }
    }

    public void sortbyID() {
        Comparator<Shippers> sortID = new Comparator<Shippers>() {
            @Override
            public int compare(Shippers s1, Shippers s2) {
                if (s1.getShipperID() > s2.getShipperID()) {
                    return 1;
                } else if (s1.getShipperID() == s2.getShipperID()) {
                    return 0;
                } else
                    return -1;
            }
        };
        Collections.sort(dsShipper, sortID);
    }

}
