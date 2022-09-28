package models;

import java.util.ArrayList;
import java.util.List;

/**
@author Markus Løtveit
*/

public class ProductDAO {
	
	/**
	@author Fake DAO that creates and returns a list of all products
	*/
	public List<Product> getAllProducts(List<Description> descriptions)
	{
		
		Product prod1 = new Product(1, "Ikea white", 15.99, "../cup.jpg", descriptions.get(0));
		Product prod2 = new Product(2, "Red oak", 199.99, "../table.jpg", descriptions.get(1));
		Product prod3 = new Product(3, "Sonos", 99.99, "../sonos.png", descriptions.get(2));
		
		
		List<Product> products = new ArrayList<Product>();
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		
		return products;
	}

}
