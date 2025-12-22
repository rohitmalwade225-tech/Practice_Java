package com.rohit.Interface;

import java.util.Scanner;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Payment Type");
		System.out.println("1. CreditCard.");
		System.out.println("2. UPI.");
		
		PaymentGateway P = new PaymentGateway();
		String choice= (sc.next());
		
		switch(choice)
		{
		case "CreditCard" ->
		{
			PaymentDemo a = P.initiatePayment(choice);
			a.processPayment();
			a.applyDiscount();
		}
		case "UPI" ->
		{
			PaymentDemo a =new UPIPaymentDemo();
			a.processPayment();
			a.applyDiscount();
		}
		default -> System.out.println("Invalid payment type selected!");

	}

   }
}

public class UPIPayment implements Payment
{
private String upiID;

public UPIPayment(String upiID) {
	super();
	this.upiID = upiID;
}

@Override
public void makePayment(double amount) {
	System.out.println("Payment of "+amount+"Rs done by using CreditCard Payment  method...");
	System.out.println("Paid Rs :"+amount+"using UPI ID :"+upiID);
	
}

@Override
public void makeRefund(double amount) {
	System.out.println("order canceled.Initiating refund...");
	System.out.println("cancelling order for amount Rs :"+amount);
	System.out.println("Refunded Rs:"+amount+"to UPI ID :"+upiID);

	
}

@Override
public void makePayment1(double amount) {
	
}

@Override
public void makeRefund1(double amount) {
	
	
}


}

public class PaymentGateway 
{
	public PaymentDemo initiatePayment(String PaymentType)
	{
		if(PaymentType.equalsIgnoreCase(PaymentType))
		
		{
			return new creditCardPaymentDemo();
					
		}
		else if(PaymentType.equalsIgnoreCase(PaymentType))
		{
			return new UPIPaymentDemo();
		}
		else
		{
			return null ;
		}
		
	}

}

public class CreditCardPayment  implements Payment
{
private String carHolder;

public CreditCardPayment(String carHolder) {
	super();
	this.carHolder = carHolder;
}

@Override
public void makePayment(double amount) {
	System.out.println("Payment of "+amount+"Rs done by using CreditCard Payment  method...");
	System.out.println("Paid Rs :"+amount+"using credit67888 Card Holder :"+carHolder);
	
}

@Override
public void makeRefund(double amount) {
	System.out.println("order canceled.Initiating refund...");
	System.out.println("cancelling order for amount Rs :"+amount);
	System.out.println("Refunded Rs:"+amount+"to credit Card Holder :"+carHolder);

	
}

@Override
public void makePayment1(double amount) {
	// TODO Auto-generated method stub
	
}

@Override
public void makeRefund1(double amount) {
	// TODO Auto-generated method stub
	
}


}
