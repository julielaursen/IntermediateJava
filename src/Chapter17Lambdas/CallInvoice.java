package Chapter17Lambdas;

import java.util.Comparator;

public class CallInvoice {
	 
	 private int partNumber;
	 private String partDescription;
	 private int quantity;
	 private double price;
	 
	 public CallInvoice(int partNumber, String partDescription, int quantity, double price)
	 {
	  this.partNumber = partNumber;
	  this.partDescription = partDescription;
	  this.quantity = quantity;
	  this.price = price;
	 }
	 
	 public float getTotalPrice()
	 {
	   return (float) (this.quantity * this.price);
	 }
	 
	 //set partNumber;
	 public void setPartNumber(int partNumber)
	 {
	  this.partNumber = partNumber;
	 }
	 
	 //get partNumber
	 public int getPartNumber()
	 {
	  return partNumber;
	 }
	 
	 //set partDescription
	 public void setPartDescription(String partDescription)
	 {
	  this.partDescription = partDescription;
	 }
	 
	 //get partDescription
	 public String getPartDescription()
	 {
	  return partDescription;
	 }
	 
	 //set quantity
	 public void setQuantity(int quantity)
	 {
	  this.quantity = quantity;
	 }
	 
	 //get quantity
	 public int getQuantity()
	 {
	  return quantity;
	 }
	 
	 //set price
	 public void setPrice(double price)
	 {
	  this.price = price;
	 }
	 
	 //get price
	 public double getPrice()
	 {
	  return price;
	 }
	 
	 @Override
	 public String toString()
	 {
	  return String.format("%-10d%20s%10d%10.2f", getPartNumber(), getPartDescription(), getQuantity(), getPrice());
	 }

	 public int compareToIgnoreCase(String string) {
	  // TODO Auto-generated method stub
	  return 0;
	 }
	 
	  public static Invoice invoiceLine(CallInvoice description, int quantity) {
	    // add validation here
	    return new Invoice(description, quantity, quantity * price);
	  }
	 
	  public static Comparator<CallInvoice> productComparator = Comparator.comparing(CallInvoice::getPartDescription);
	 
	  public static Comparator<CallInvoice> priceComparator = Comparator.comparing(CallInvoice::getPrice);
	 
	  public static Comparator<CallInvoice> quantityComparator = Comparator.comparing(CallInvoice::getQuantity);
	}
}