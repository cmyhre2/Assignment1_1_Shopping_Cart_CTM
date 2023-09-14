/**
 * This class is the shopping app that uses a ShoppingCart class & Item class.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 1 Lab 1)
 * Fall 2023 (09/14/2023)
 */
public class Application {
	public static void main(String[]args) {
		/*
	 	* Items section: 15 items created for the purpose of the shop
	 	*/
		Item milk = new Item("Gallon of Milk", 1.25);
		Item water = new Item("24 Pack of Bottled Water", 5.00);
		Item cereal = new Item("Captain Crunch Cereal", 3.50);
		Item steak = new Item("16oz Bonless Sirloin Steak", 10.00);
		Item blanket = new Item("67\" x 40\" Blanket", 40.00);
		Item pillow = new Item("Soft Pillow", 15.00);
		Item lamp = new Item("Bedside Lamp", 25.00);
		Item mountainDew = new Item("20oz Mountain Dew Bottle", 3.00);
		Item comforter = new Item("Comforter", 50.00);
		Item lantern = new Item("Lantern", 20.00);
		Item chicken = new Item("5 lb bag of Chicken Breasts", 20.00);
		Item apple = new Item("1 lb bag of Apples", 1.00);
		Item watermelon = new Item("Large Watermelon", 7.50);
		Item orange = new Item("1 lb bag of Oranges", 3.00);
		Item pumpkinPie = new Item("10\" Pumpkin Pie", 10.00);
	
		/*
		 * Test section: this part of the Application class tests all ShoppingCart class methods
		 */
		ShoppingCart test = new ShoppingCart();
		test.addItem(milk);
		test.addItem(water);
		test.addItem(cereal);
		test.addItem(steak);
		test.addItem(blanket);
		test.addItem(pillow);
		test.addItem(lamp);
		test.addItem(mountainDew);
		test.addItem(comforter);
		test.addItem(lantern);
		test.addItem(chicken);
		test.addItem(apple);
		test.addItem(watermelon);
		test.addItem(orange);
		test.addItem(pumpkinPie);
		test.addItem(milk);
		test.addItem(milk);
		test.addItem(milk);
		test.getQuantity(milk);
		test.getCart();
		test.removeItem(milk);
		test.removeItem(milk);
		test.getCart();
		test.contains(orange);
		test.removeItem(orange);
		test.contains(orange);
		test.isEmpty();
		test.removeCart();
		test.isEmpty();
		test.getCart();
		System.out.println("\n\n\nTest operations successfully completed. \n\n\n\n\n\n");
		
		/*
		 * Post-test section: This section adds 5 items to the cart, views them. removes 2 items, & views cart again.
		 */
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(milk);
		cart.addItem(orange);
		cart.addItem(apple);
		cart.addItem(watermelon);
		cart.addItem(water);
		cart.getCart();
		cart.removeItem(milk);
		cart.removeItem(watermelon);
		cart.getCart();
	}
}
