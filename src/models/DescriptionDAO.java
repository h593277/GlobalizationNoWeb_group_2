package models;

import java.util.ArrayList;
import java.util.List;

/**
 @author Markus Løtveit
 */

public class DescriptionDAO {
	
	/**
	 Fake DAO that creates and returns a list of all Descriptions
	 */
	public List<Description> getAllDescriptions()
	{
		
		Description desc1 = new Description(1, "Cup from Ikea");
		
		Description desc2 = new Description(2, "Table from italian table mafia");
		
		Description desc3 = new Description(3, "Speaker from Sonos");
		
		List<Description> descriptions = new ArrayList<Description>();
		descriptions.add(desc1);
		descriptions.add(desc2);
		descriptions.add(desc3);
		
		return descriptions;
	}

}
