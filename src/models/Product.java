package models;

public class Product {
	
	private int pno;
	private String pName;
	private double priceInEuro;
	private String imageFile;
	private Description pDescription;
	
	public Product(int pno, String pName, double priceInEuro, String imageFile, Description pDescription) {
		super();
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
		this.pDescription = pDescription;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPriceInEuro() {
		return priceInEuro;
	}

	public void setPriceInEuro(double priceInEuro) {
		this.priceInEuro = priceInEuro;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public Description getpDescription() {
		return pDescription;
	}

	public void setpDescription(Description pDescription) {
		this.pDescription = pDescription;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pName=" + pName + ", priceInEuro=" + priceInEuro + ", imageFile=" + imageFile
				+ ", pDescription=" + pDescription + "]";
	}
	
	
	
	
	

}
