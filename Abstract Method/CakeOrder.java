

import java.util.Scanner;

class cake
{
	private String shape;
	private String flavor;
	private int quantity;
	public static double price =400;
	
	
	public cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
		
	}
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static double getPrice() {
		return price;
	}

	public static void setPrice(double price) {
		cake.price = price;
	}

	@Override
	public String toString() {
		return "A "+shape+" "+flavor+" Cake of"+quantity+" is Reade @"+(price*quantity);
	}


	
}

class OrderedCake extends cake
{
	String message;
	public OrderedCake()
	{
		super("Round", "Vanilla",1);
	}

	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
		
		
	}
	public OrderedCake(String shape, String flavor, int quantity,String message) {
		super(shape, flavor, quantity);
		this.message=message;
}

	public String tostring()
	{
		if(message!=null)
		
		return "A "+super.getShape()+" Cake of "+super.getQuantity()+" is Reade with "+this.message+" @"+(super.getPrice()*super.getQuantity());
		
	else
		return super.toString();
	}
	
}




public class CakeOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		OrderedCake O1=new OrderedCake();
		OrderedCake O2=new OrderedCake("Flavor","quantity",10);
		OrderedCake O3=new OrderedCake("Flavor","quantity",4,"message");
		
		System.out.println(O1);
		System.out.println(O2);
		System.out.println(O3);
		
		
		
	}

}

