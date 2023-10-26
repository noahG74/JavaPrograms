package Exam1;

public class SodaDriver {

	public static void main(String[] args) {
		Soda drink1 = new Soda("Coca-Cola", 2);
		Soda drink2 = new Soda("Pepsi", 1);
		Soda drink3 = new Soda("Sprite", -1);
		
		System.out.print("Drink 1 Brand: " + drink1.getBrand());
		System.out.print("\nDrink 1 price: " + drink1.getPrice());
		
		System.out.print("\n\nDrink 2 Brand: " + drink2.getBrand());
		System.out.print("\nDrink 2 price: " + drink2.getPrice());
		
		System.out.print("\n\nDrink 3 Brand: " + drink3.getBrand());
		System.out.print("\nDrink 3 price: " + drink3.getPrice());

	}

}
