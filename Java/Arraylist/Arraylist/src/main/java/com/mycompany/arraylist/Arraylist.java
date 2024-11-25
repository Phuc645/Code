/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author liamta
 */
public class Arraylist {

    public static void main(String[] args) {

      // create an empty arrayList
      ArrayList<String> arrayList = new ArrayList<>();

      // use add() method to add elements in the arrayList
      arrayList.add("Lan");
      arrayList.add("Hung");
      arrayList.add("Thuong");
      arrayList.add("Thao");        

      // let us print all the elements available in arrayList
      System.out.println("ArrayList = " + arrayList);

      
      System.out.println("Nhap vao ten ban muon tim : ");
      Scanner sc = new Scanner(System.in);
      String ten = sc.nextLine();
      
      boolean found = false;
        for (String name : arrayList) {
            if (name.equals(ten)) {
                found = true;
                break; // Exit the loop once a match is found
            }
        }

        if (found) {
            System.out.println(ten + " is present in the ArrayList.");
        } else {
            System.out.println(ten + " is not found in the ArrayList.");
        }
    }
}
