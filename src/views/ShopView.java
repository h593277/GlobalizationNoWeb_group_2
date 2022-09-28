package views;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import models.Cart;
import models.Product;

public class ShopView {
	
	private Cart cart; 
	private Locale locale; 
	private ResourceBundle appText; 
	
	public ShopView(Cart cart) {
		super();
		this.cart = cart;
		locale = new Locale("no", "NO");
		appText = ResourceBundle.getBundle("apptexts", locale);
	}
	
	public void changeLanguage(Locale lang)
	{
		locale = lang;
		appText = ResourceBundle.getBundle("apptexts", locale);
	}

	public void initializeView(List<Product> products)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("welcome"));
		//todo
		//print out all products
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		
		System.out.println(appText.getString("navigationCommand"));
		System.out.println(appText.getString("exit"));
		System.out.println(appText.getString("add"));
		System.out.println(appText.getString("remove"));
		System.out.println(appText.getString("cart"));
		System.out.println(appText.getString("shop"));
		System.out.println(appText.getString("languageNO"));
		System.out.println(appText.getString("languageEN"));
		System.out.println(appText.getString("languageDE"));
		System.out.println("-----------------------------------------------------");
		
	}
	
	public void shopView(List<Product> products)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("welcome"));
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
		System.out.println(appText.getString("userCart"));
		for(Product p : cart.getProducts())
		{
			total += p.getPriceInEuro();
			System.out.println(p.toString());
		}
		System.out.println(appText.getString("total") + " " + total);
		System.out.println("-----------------------------------------------------");
	}
	
	public Product addToCart(Product product)
	{
		System.out.println(appText.getString("addProduct") + " " + product.getpName());
		cart.addProduct(product);
		return product;
	}
	
	public Product removeFromCart(Product product)
	{
		System.out.println(appText.getString("removeProduct") + " " + product.getpName());
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
