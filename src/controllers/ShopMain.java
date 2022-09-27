package controllers;

import java.util.ArrayList;
import java.util.List;
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
		
		butikken.initializeView(products);
		
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
			case "cart":
				butikken.cartView();
				break;
			case "shop":
				butikken.initializeView(products);
				break;
			
			}
		}
	
		
		
		//create inputscanner
		//switch for different butikk methods based on input

	}

}
