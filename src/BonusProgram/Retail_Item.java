package BonusProgram;

public class Retail_Item implements Comparable<Retail_Item> 
{

	private int number;
	private String description;
	private int quantity;
	private float price;


	public Retail_Item(int number, String description, int quantity, float price)
	{
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public String toString(){
		return number + " " + description + " " + quantity +  " " + price +"\n";

	}
	public int compareTo(Retail_Item other) {
		if (other == null) {
			return 1;
		}
		return this.description.compareToIgnoreCase(other.description);
	}
}