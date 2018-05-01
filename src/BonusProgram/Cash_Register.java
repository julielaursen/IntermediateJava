package BonusProgram;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Cash_Register {
	
	ArrayList<Retail_Item> inventory = new ArrayList<Retail_Item>();
	ArrayList<Retail_Item> cart = new ArrayList<Retail_Item>();
	ArrayList<String> cashier = new ArrayList<String>();
	
	static Random rand = new Random(); 
	//int value = rand.nextInt(cashier.size());

	Scanner input = new Scanner(System.in);
	//double totalPrice;
	//double tax;
	//double grandTotal;

	Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
	//float total = 0;
	int sentinal = 0;

			
	public int display_menu()
	{

		while(sentinal != -1)
		{ 
			int itemIndex = 0;

			System.out.print("Please select the item you wish to purchase.\n");
			System.out.print("Program Menu: \n");
			for (Retail_Item item : inventory) {
				itemIndex++;
				System.out.printf("%2d. %s \n", itemIndex, item.getDescription());
			}
			System.out.print("11. Clear Cash Register\n");
			System.out.print("12. Show Inventory\n");
			System.out.print("13. Check Out\n");
			sentinal = input.nextInt();
			if(sentinal < 11)
			{
			Retail_Item purchase = inventory.get(sentinal -1);
			//purchase.setQuantity(1);
			purchase_item(purchase);
			
			}
			else if(sentinal == 11)
			{
				clearRegister();
				System.out.println("cart.length() == " + cart.size());
			}
			else if(sentinal == 12)
				show_items();
			else{
				sentinal = -1;
				System.out.println("Your total purchase items were:\n");

				cart.stream()
				.sorted()
				.forEach(item -> System.out.printf("%5d  %-15s  %4d  %7.2f %n", item.getNumber(),item.getDescription(),item.getQuantity(),item.getPrice()));

				float totalPrice = getTotal();
				double tax = totalPrice * 0.05;
				double grandTotal = totalPrice + tax;
				System.out.printf("   %-15s  %17.2f %n", "Total", totalPrice);
				System.out.printf("   %-15s  %17.2f %n", "Tax", tax);
				System.out.printf("   %-15s  %17.2f %n", "Grand Total", grandTotal);

				System.out.println("%nY to confirm and accept a receipt or N to clear your cart and start over ");
				input.nextLine();
				String userSelection = input.nextLine();
				if (!userSelection.equalsIgnoreCase("Y")) {
					clearRegister();										// if user doesn't want list, go clear it
					sentinal = 1;
				}
				else {
					writeFile();
					reduceInventory();
				}
			}
		}
		return sentinal;
	}
	
	

	
	public void displayInventory()
	{
	for(Retail_Item obj : inventory)
	{
		System.out.println(obj);
	}
	}
	
	public void addInventory(int itemNumberIn, String itemDescriptionIn, int unitsInInventoryIn, float priceIn) {
		Retail_Item item = new Retail_Item(itemNumberIn, itemDescriptionIn, unitsInInventoryIn, priceIn);
		inventory.add(item);
	}
	
	public void addCashier(String c){
		cashier.add(c);
	}
	
	public void purchase_item(Retail_Item item)
	{
		//for (Integer element : integers){
			//cart.add(element, null, element, total);
			//System.out.println(cart);
		//	}
	//	return cart;
		
		Retail_Item purchasedItem = new Retail_Item(item.getNumber(), item.getDescription(), 1, item.getPrice());	
		cart.add(purchasedItem);
		
		//deprecate quantity by one
 	}

	public float getTotal()
	{
		float total = 0;
		//total = total + r.getPrice();
		//System.out.println(total);
		//return total;
		for (Retail_Item item : cart){
			total += item.getPrice();
		}
		return total;
		
	}
	
	public void show_items()
	{
		for(Retail_Item item : cart)
		{
			System.out.print(item.toString());
		}
	}
	
	public void clearRegister()
	{
		cart.clear();//clears the Cash_register's object internal list
	}
	
	public void writeFile()
	{
		int value1 = cashier.size();
		int value = rand.nextInt(value1);

		PrintWriter outputFile1;
		try {
			outputFile1 = new PrintWriter(new FileWriter( "receipt.txt" ));

			outputFile1.println("              *************************RECEIPT****************");

			for(Retail_Item item : cart)
				{
				outputFile1.printf("%5d  %-15s  %4d  %7.2f %n", item.getNumber(),item.getDescription(),item.getQuantity(),item.getPrice());
				}

			float totalPrice = getTotal();
			double tax = totalPrice * 0.05;
			double grandTotal = totalPrice + tax;
			outputFile1.printf("   %-15s  %17.2f %n", "Total", totalPrice);
			outputFile1.printf("   %-15s  %17.2f %n", "Tax", tax);
			outputFile1.printf("   %-15s  %17.2f %n", "Grand Total", grandTotal);

			LocalDateTime a = LocalDateTime.now();
		    
			outputFile1.printf(cashier.get(value));
			outputFile1.printf("%ndate: " + a);

			outputFile1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void reduceInventory() {
		
		Retail_Item item = null;
		int itemId = 0;
		int amount = 0;
		for (int i = 0; i < cart.size(); i++) {
			item = cart.get(i);					// get item from cart
			itemId = item.getNumber();		// get item number
			amount = item.getQuantity();		// get amount sold so can be put back into inventory
			//cart.remove(i);					// remove this item from purchased list
			
			adjustInventory(itemId, amount);
		}	
		//inventory.forEach(item1 -> System.out.printf("%5d  %-15s  %4d  %7.2f \n", item1.getNumber(),item1.getDescription(),item1.getQuantity(),item1.getPrice()));	}
}
		// adjust inventory by amount sold
	public void adjustInventory(int itemId, int amount) {
		
		for (Retail_Item item : inventory) {
			if (item.getNumber() == itemId) {		// if this item = target id, reduce amount of this item
				item.reduceQuantity(amount);
				System.out.println("reducing item " + itemId + " inventory by " + amount);
			}
		}
	}

}
