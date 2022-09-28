package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.Cart;
import models.Description;
import models.DescriptionDAO;
import models.Product;
import models.ProductDAO;
import views.ShopView;

public class ShopMain {

	public static void main(String[] args) {
		Boolean running = true;
		DescriptionDAO descDAO = new DescriptionDAO();
		ProductDAO prodDAO = new ProductDAO();
		List<Description> descriptions = descDAO.getAllDescriptions();
		List<Product> products = prodDAO.getAllProducts(descriptions);
		
		Scanner user = new Scanner(System.in);
		
		ShopView butikken = new ShopView(new Cart(new ArrayList<Product>()));
		
		butikken.initializeView();
		
		while(running)
		{
			String input = user.nextLine();
			
			switch(input)
			{
			case "exit":
				running = false;
				break;
			case "add 1":
				butikken.addToCart(products.get(0));
				break;
			case "add 2":
				butikken.addToCart(products.get(1));
				break;
			case "add 3":
				butikken.addToCart(products.get(2));
				break;
			case "remove 1":
				butikken.removeFromCart(butikken.getCart().getProducts().get(0));
				break;
			case "remove 2":
				butikken.removeFromCart(butikken.getCart().getProducts().get(1));
				break;
			case "remove 3":
				butikken.removeFromCart(butikken.getCart().getProducts().get(2));
				break;
			case "cart":
				butikken.cartView();
				break;
			case "shop":
				butikken.shopView(products);
				break;
			case "NO":
				Locale localeNO = new Locale("no", "NO");
				butikken.setLocale(localeNO);
				break;
			case "EN":
				Locale localeEN = new Locale("en", "US");
				butikken.setLocale(localeEN);
				break;
			case "DE":
				Locale localeDE = new Locale("de", "DE");
				butikken.setLocale(localeDE);
				break;
			case "home":
				butikken.initializeView();
				break;
			
			}
		}

	}

}
