package views;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import models.Cart;
import models.Product;
import java.text.NumberFormat;

/**
@author Markus Løtveit
*/

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

	/**
	Creates the home view
	*/
	public void initializeView()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("welcome"));
	
		System.out.println(appText.getString("navigationCommand"));
		System.out.println(appText.getString("exit"));
		System.out.println(appText.getString("add"));
		System.out.println(appText.getString("remove"));
		System.out.println(appText.getString("cart"));
		System.out.println(appText.getString("shop"));
		System.out.println(appText.getString("home"));
		System.out.println(appText.getString("languageNO"));
		System.out.println(appText.getString("languageEN"));
		System.out.println(appText.getString("languageDE"));
		System.out.println("© MMVIII-MMXXII HVL");
		System.out.println("-----------------------------------------------------");
		
	}
	
	/**
	Creates the shop view based {@code list<Product>}
	*/
	public void shopView(List<Product> products)
	{
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("welcome"));
		for(Product p : products)
		{
			System.out.println(p.toString());
		}
		System.out.println("© MMVIII-MMXXII HVL");
		System.out.println("-----------------------------------------------------");
	}
	
	/**
	Creates the cart view
	*/
	public void cartView()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		double total = 0;
		System.out.println("-----------------------------------------------------");
		System.out.println(appText.getString("userCart"));
		for(Product p : cart.getProducts())
		{
			total += p.getPriceInEuro();
			System.out.println(p.toString());
		}
		System.out.println(appText.getString("total") + " " + formatter.format(total));
		System.out.println("© MMVIII-MMXXII HVL");
		System.out.println("-----------------------------------------------------");
	}
	
	/**
	Adds a product to the cart {@code Product product}
	*/
	public Product addToCart(Product product)
	{
		System.out.println(appText.getString("addProduct") + " " + product.getpName());
		cart.addProduct(product);
		return product;
	}
	
	/**
	 Removes a product from the cart {@code Product product} in a very basic manner
	*/
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

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
		this.appText = ResourceBundle.getBundle("apptexts", locale);
	}

	public ResourceBundle getAppText() {
		return appText;
	}

	public void setAppText(ResourceBundle appText) {
		this.appText = appText;
	}
	
	
	
	

}
