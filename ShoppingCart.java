/**
 * This class creates the functionality of the shopping cart app by making the shopping cart itself to manage & search for items to add.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 1 Lab 1)
 * Fall 2023 (09/14/2023)
 */
public class ShoppingCart {
		public ArrayBag<Item> cart = new ArrayBag<Item>(200);
		/** 
		 * Adds a specified item to the cart.
		 * @param a 
		 */
		public void addItem(Item a) {
			cart.add(a);
			System.out.println("\n" + a.getName() + " has been added to the cart.");
		}//end addItem()
		
		/** Removes a specified item from the cart.
		 * @param a 
		 */
		public void removeItem(Item a) {
			cart.remove(a);
			System.out.println("\n" + a.getName() + " has been removed from the cart.");
		}//end removeItem()
		
		/** Prints the contents of the cart.
		 * @return String variable in which the cart is stored in and to be printed. 
		 */
		public void getCart() {
			Object [] array = cart.toArray();
			
			System.out.print("\n\n\nNumber of Items in Cart: " + calculateItemCount());
			System.out.printf("\nTotal: $%.2f",calculateTotalPrice());
			System.out.print("\nItems Currently in the Shopping Cart:");
			System.out.print("\n====================================");
			for(int i=0; i<array.length; i++) {
				System.out.print("\nItem Name: " + ((Item) array[i]).getName());
				System.out.printf("\nItem Price $%.2f",((Item) array[i]).getPrice());
				System.out.print("\n====================================");
			}
			System.out.println("\n\n\n");
		}//end getCart()
		
		/** 
		 * Removes all items in the cart 
		 */
		public void removeCart() {
			cart.clear();
			System.out.println("\nThe cart has been cleared.");
		}//end removeCart()
		
		/** 
		 * Checks if the cart is empty. 
		 * if statement to print the correct response if the cart is empty or not.
		 */
		public void isEmpty() {
			if(cart.isEmpty()) {//checks result for if the cart is empty
				System.out.println("\nThe cart is empty.");
			}//end action if result is true
			else
				System.out.println("\nThe cart isn't empty.");//end action if result is false
		}//end isEmpty()
		
		/** 
		 * Gets the quantity of a specified item in the cart.
		 * @param Item a to be checked for quantity
		 */
		public void getQuantity(Item a) {
			System.out.println(cart.getFrequencyOf(a) + " x " + a.getName());
		}//end getQuantity()
		
		/** 
		 * Checks if the cart has a certain item.
		 * @param a (item checked for)
		 * if statement to print the correct response to the result of the item check
		 */
		public void contains(Item a) {
			if(cart.contains(a)){//checks result for if the cart contains item a
				System.out.println("\nThere is at least one " + a.getName() + " in the cart.");
			}//end action if result is true
			else
				System.out.println("\nThere is no " + a.getName() + " in the cart.");//end action if result is false
		}//end contains()
		
		/*
		 * Calculates the total price of the cart
		 */
		public double calculateTotalPrice() {
			double totalPrice = 0.0;
			Object [] array = cart.toArray();
			for(int i=0; i<array.length;i++){
				totalPrice = totalPrice + ((Item) array[i]).getPrice();
			}
			return totalPrice;
		}//end calculateTotalPrice()
		
		/*
		 * Calculates total item count in the cart
		 */
		public int calculateItemCount() {
			return cart.getCurrentSize();
		}
	}//end ShoppingCart class
