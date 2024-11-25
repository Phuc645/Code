/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.fit.lab02;
import java.util.Scanner;
/**
 *
 * @author Ph636
 */
public class SinhVien {
    int mssv;
    String hoten;
    float lt;
    float th;
    float tb;
    public SinhVien () {
    }
    public SinhVien (int mssv, String hoten, float lt, float th) {
        this.hoten = hoten;
        this.mssv = mssv;
        this.lt = lt;
        this.th = th;
    }
    public void GetMSSV (){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhap MSSV: ");
        mssv = sc.nextInt();
        sc.close();
    }
    public void GetHoten (){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhap ho ten: ");
         hoten = sc.nextLine();
         sc.close();
    }
    public void GetLT (){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhap diem ly thuyet: ");
        lt = sc.nextFloat();
        sc.close();
    }
    public void GetTH (){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Nhap diem thuc hanh: ");
        th = sc.nextFloat();
        sc.close();
    }
    public void setLT (){
        if (lt < 0 || lt >10){
            System.out.println("Nhap lai");
        }
    }
    public void setTH (){
        if (th < 0 || th > 10){
            System.out.println("Nhap lai");
       }
    }    
    public void DiemTB (){
        tb = (lt + th*2) / 3;
    }
    public void Output (){
        System.out.println(mssv+"-"+hoten+"-"+lt+"-"+th+"-"+tb);
    }
    
    
    
}
