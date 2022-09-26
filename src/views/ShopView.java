package views;

import models.Cart;
import models.Product;

public class ShopView {
	
	public void initializeView()
	{
		System.out.println("Velkommen til butikken!");
		//todo
		//print out all products
		
	}
	
	public void cartView(Cart cart)
	{
		System.out.println("Cart View");
		for(Product p : cart.getProducts())
		{
			System.out.println(p.toString());
		}
	}
	
	//todo
	public Product addToCart()
	{
		return new Product(0, null, 0, null, null);
	}

}
