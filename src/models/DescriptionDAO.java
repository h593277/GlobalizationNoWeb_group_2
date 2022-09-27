package models;

import java.util.ArrayList;
import java.util.List;

public class DescriptionDAO {
	
	public List<Description> getAllDescriptions()
	{
		
		//create descriptions
		
		Description desc1 = new Description(1, "Kopp fra Ikea");
		
		Description desc2 = new Description(2, "Bord fra Italienske bord mafia");
		
		Description desc3 = new Description(3, "Høytaler fra Sonos");
		
		
		//todo add to list
		List<Description> descriptions = new ArrayList<Description>();
		descriptions.add(desc1);
		descriptions.add(desc2);
		descriptions.add(desc3);
		
		return descriptions;
	}

}
