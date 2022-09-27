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
		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to the store!");
		//todo
		//print out all products
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		
		System.out.println("To navigate, use the following commands:");
		System.out.println("exit to stop application");
		System.out.println("add x to add an item to your cart");
		System.out.println("remove x to remove an item from your cart");
		System.out.println("cart to show your cart");
		System.out.println("shop to return to shop view");
		System.out.println("-----------------------------------------------------");
		
	}
	
	public void shopView(List<Product> products)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to the store!");
		//todo
		//print out all products
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void cartView()
	{
		double total = 0;
		System.out.println("-----------------------------------------------------");
		System.out.println("Cart View");
		for(Product p : cart.getProducts())
		{
			total += p.getPriceInEuro();
			System.out.println(p.toString());
		}
		System.out.println("Total: " + total);
		System.out.println("-----------------------------------------------------");
	}
	
	public Product addToCart(Product product)
	{
		System.out.println("You added " + product.getpName() + " to your cart!" );
		cart.addProduct(product);
		return product;
	}
	
	public Product removeFromCart(Product product)
	{
		System.out.println("You removed " + product.getpName() + " from your cart!" );
		cart.removeProduct(product);
		return product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
