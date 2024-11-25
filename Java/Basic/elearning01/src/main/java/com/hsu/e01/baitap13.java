package com.hsu.e01;

import java.util.Scanner;

public class baitap13 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a = sc.nextInt();
        System.out.println("Nhap canh b: ");
        b = sc.nextInt();
        System.out.println("Nhap canh c: ");
        c = sc.nextInt();
        if (a == b && b == c && c == a)
        System.out.println("Tam giac deu");
        else if( a == b && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2))
        System.out.println("Tam giac vuong can tai C");
        else if( c == b && Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a,2))
        System.out.println("Tam giac vuong can tai A");
        else if( a == c && Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b,2))
        System.out.println("Tam giac vuong can tai B");
        else if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2))
        System.out.println("Tam giac vuong tai C");
        else if(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a,2))
        System.out.println("Tam giac vuong tai A");
        else if(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b,2))
        System.out.println("Tam giac vuong tai B");
        else if( a == b )
        System.out.println("Tam giac can tai C");
        else if( c == b )
        System.out.println("Tam giac can tai A");
        else if( a == c )
        System.out.println("Tam giac can tai B");
        else 
        System.out.println("Tam giac thuong");
        sc.close();
    }
}
