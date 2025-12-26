package com.rohit.abstractMethod;

import java.util.Scanner;

abstract class product
{
	private String name;
	private double price;
	private String category;
	
	public product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract void applyDiscount(double percentage);
	
	public abstract double calculateTax();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}
 
 class DigitalProduct extends product
 {
	 private String licenseKey;

	 public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	 }

	 @Override
	 public void applyDiscount(double percentage) {
		 
		double discount=getPrice()*percentage/100;
		setPrice(getPrice()-discount);
		
		
		
	 }

	 @Override
	 public double calculateTax() {
		double tax=getPrice()*0.05;
		return  tax;
		
	 }

	 @Override
	 public String toString() {
		return "DigitalProduct [licenseKey=" + licenseKey + "]";
	 }
	
	 
 }
 
 
 class PhysicalProduct extends product
 {
	 private double shippingWeight;

	 public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	 }
	 @Override
	 public void applyDiscount(double percentage) {
		 
		double discount=getPrice()*percentage/100;
		setPrice(getPrice()-discount);
		
		
		
	 }

	 @Override
	 public double calculateTax() {
		double tax=getPrice()*0.08;
		return  tax;
		
	 }
	 public double calculateShippingCost()
	 {
		 double shippingCost=shippingWeight*5;
		 
		 return shippingCost;
	 }
	 @Override
	 public String toString() {
		return "PhysicalProduct [shippingWeight=" + shippingWeight + "]";
	 }
	 
 }


public class Product {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type:");
		System.out.println("1. Digital Product:");
		System.out.println("2. Physical Product");
		
		int choice=Integer.parseInt(sc.nextLine());
		
		
		switch(choice)
		{
		case 1 ->
		{
			System.out.println("Enter Digital Product Name :");
			String pname=sc.nextLine();
			
			System.out.println("Enter Product Price :");
			double price=Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter Product Category :");
			String category=sc.nextLine();
			
			System.out.println("Enter Product License Key :");
			String key=sc.nextLine();
			
			System.out.println("Enter the discount % on final bill");
			int discount=Integer.parseInt(sc.nextLine());
		}
		
		}
		
	}

}


