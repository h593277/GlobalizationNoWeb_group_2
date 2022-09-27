package models;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	public List<Product> getAllProducts(List<Description> descriptions)
	{
		
		//create products
		Product prod1 = new Product(1, "Ikea white", 15.99, null, descriptions.get(0));
		Product prod2 = new Product(2, "Red oak", 199.99, null, descriptions.get(1));
		Product prod3 = new Product(3, "Sonos", 99.99, null, descriptions.get(2));
		
		
		//todo add to list
		List<Product> products = new ArrayList<Product>();
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		
		return products;
	}

}
