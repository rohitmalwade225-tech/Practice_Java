package com.rohit.multilevel;

import java.util.Scanner;


class Student {
 int studentId;
 String name;
 double examFee;

 public Student(int studentId, String name, double examFee) {
     this.studentId = studentId;
     this.name = name;
     this.examFee = examFee;
 }

 public String displayDetails() {
     return "Student[name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
 }

 public double payFee(double amount) {
     return examFee - amount;
 }

 @Override
 public String toString() {
     return displayDetails();
 }
}

//Subclass for DayScholar
class DayScholar extends Student {
 double transportFee;

 public DayScholar(int studentId, String name, double examFee, double transportFee) {
     super(studentId, name, examFee);
     this.transportFee = transportFee;
 }

 @Override
 public String displayDetails() {
     return "DayScholar[TransportFee=" + transportFee + ",name=" + name +
             ",studentId=" + studentId + ",examFee=" + examFee + "]";
 }

 @Override
 public double payFee(double amount) {
     double totalFee = examFee + transportFee;
     return totalFee - amount;
 }
}


class Hosteller extends Student {
 double hostelFee;

 public Hosteller(int studentId, String name, double examFee, double hostelFee) {
     super(studentId, name, examFee);
     this.hostelFee = hostelFee;
 }

 @Override
 public String displayDetails() {
     return "Hosteller[HostelFee=" + hostelFee + ",name=" + name +
             ",studentId=" + studentId + ",examFee=" + examFee + "]";
 }

 @Override
 public double payFee(double amount) {
     double totalFee = examFee + hostelFee;
     return totalFee - amount;
 }
}


public class TesterDayScholarHosteller {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 1 for DayScholar, 2 for Hosteller:");
     int choice = sc.nextInt();

     System.out.println("Enter studentId");
     int id = sc.nextInt();
     System.out.println("Enter name");
     String name = sc.next();
     System.out.println("Enter examFee");
     double examFee = sc.nextDouble();

     if (choice == 1) {
         System.out.println("Enter transportFee");
         double transportFee = sc.nextDouble();
         System.out.println("Enter amountPaid");
         double amountPaid = sc.nextDouble();

         DayScholar ds = new DayScholar(id, name, examFee, transportFee);
         System.out.println(ds.displayDetails());

         double remaining = ds.payFee(amountPaid);
         if (remaining == 0) {
             System.out.println("All Fees are clear");
         } else if (remaining > 0) {
             System.out.println("Remaining amount to pay is: " + remaining);
         } else {
             System.out.println("Excess amount paid is: " + (-remaining));
         }

     } else if (choice == 2) {
         System.out.println("Enter HostelFee");
         double hostelFee = sc.nextDouble();
         System.out.println("Enter amountPaid");
         double amountPaid = sc.nextDouble();

         Hosteller hs = new Hosteller(id, name, examFee, hostelFee);
         System.out.println(hs.displayDetails());

         double remaining = hs.payFee(amountPaid);
         if (remaining == 0) {
             System.out.println("All Fees are clear");
         } else if (remaining > 0) {
             System.out.println("Remaining amount to pay is: " + remaining);
         } else {
             System.out.println("Excess amount paid is: " + (-remaining));
         }
     } else {
         System.out.println("Invalid choice!");
     }

     sc.close();
 }
}


