
public class ShoppingCart {

	public static void main(String[] args) {
		
		// Test Shopping Cart system
		displayItemAndTotal("Apple", 10.5, "Banana", 5.75, "Orange", 7.3);
		displayItemAndTotal("Milk", 20.0, "Bread", 15.0);
		displayItemAndTotal(); // รับค่าการ return

	}
	
	// method รับสินค้าในตะกร้าและคำนวณราคาสินค้า
	public static void displayItemAndTotal(Object... items) {
		
		// Object...  = varargs
		// items = argument
		
		if (items.length == 0) {
			System.out.println("No item in the cart.");
			return; // return ค่ากลับไปยังตัวที่เลือกใช้
			
		}
		
		double totalPrice = 0.0;
		System.out.println("Item in the cart: ");
		
		for (int i = 0; i < items.length; i+=2) { 
			String itemName = (String) items[i];  // casting for parameter
			double itemPrice = (double) items[i+1]; // casting for parameter
			totalPrice += itemPrice;
			
			System.out.printf("- %s: $%.2f%n", itemName, itemPrice);
		} // end of for loop
		System.out.printf("Total price: $%.2f%n", totalPrice);
		System.out.println();
	} // end of displayItemAndTotal() method
}
