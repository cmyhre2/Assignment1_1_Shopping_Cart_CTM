/**
 * This class creates and manages items on a shopping app that the shopping cart will add for users to buy.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 1 Lab 1)
 * Fall 2023 (09/14/2023)
 */
public class Item {
	private String name;
	private double price;
	/**
	 * Preferred contructor for creating items with specified attributes.
	 * @param s & p
	 */
	public Item(String s, double p) {
		name = s;
		price = p;
	}//end Item() preferred constructor
	
	/**
	 * Default constuctor for creating items with default values in the attributes' fields.
	 */
	public Item() {
		name = "";
		price = 0.0;
	}//end Item() default constructor
	
	/**
	 * Getter for item name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName()
	
	/**
	 * Setter for item name
	 * @param s
	 */
	public void setName(String s) {
		name = s;
	}//end setName()
	
	/**
	 * Getter for an item's price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}//end getPrice()
	
	/**
	 * Setter for an item's price
	 * @param p
	 */
	public void setPrice(double p) {
		price = p;
	}//end setPrice()
}//end Item class
