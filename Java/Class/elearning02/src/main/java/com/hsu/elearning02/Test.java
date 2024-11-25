package com.hsu.elearning02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // create an empty arrayList
      ArrayList<Student> arrayList = new ArrayList<>();

      // use add() method to add elements in the arrayList
      arrayList.add(new Student(1, "Julie"));
      arrayList.add(new Student(2, "Robert"));
      arrayList.add(new Student(3, "Adam"));      

      // let us print all the elements available in arrayList
      System.out.println("ArrayList = " + arrayList);

      // arrayList contains element Robert
      if (arrayList.contains(new Student(2, "Robert"))) {
         System.out.println("Student Robert is present in the arrayList");
      } else {
         System.out.println("Student Robert is not present in the arrayList");
      }

      // arrayList does not contain element Jane
      if (arrayList.contains(new Student(4, "Jane"))) {
         System.out.println("Student Jane is present in the arrayList");
      } else {
         System.out.println("Student Jane is not present in the arrayList");    
      }
   }
} 
class Student {
   int rollNo;
   String name;

   Student(int rollNo, String name){
      this.rollNo = rollNo;
      this.name = name;
   }

   @Override
   public String toString() {
      return "[ " + this.rollNo + ", " + this.name + " ]";
   }
   
   @Override
   public boolean equals(Object obj) {
      Student s = (Student)obj;
      return this.rollNo == s.rollNo && this.name.equalsIgnoreCase(s.name);
   }
}
    

    



         
    
