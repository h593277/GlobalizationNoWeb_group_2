package views;

import java.util.List;

import models.Cart;
import models.Product;

public class ShopView {
	
	private Cart cart; 
	
	public ShopView(Cart cart) {
		super();
		this.cart = cart;
	}

	public void initializeView(List<Product> products)
	{
		System.out.println("Welcome to the store!");
		//todo
		//print out all products
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		
		System.out.println("To navigate, use the following commands:");
		System.out.println("exit to stop application");
		System.out.println("add x to add item to cart");
		System.out.println("cart to show your cart");
		System.out.println("shop to return to shop view");
		
	}
	
	public void cartView()
	{
		System.out.println("Cart View");
		for(Product p : cart.getProducts())
		{
			System.out.println(p.toString());
		}
	}
	
	//todo
	public Product addToCart(Product product)
	{
		cart.addProduct(product);
		return product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
