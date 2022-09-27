package models;

public class Description {
	
	private int langCode;
	private String text;
	
	public Description(int langCode, String text) {
		super();
		this.langCode = langCode;
		this.text = text;
	}
	
	public int getLangCode() {
		return langCode;
	}
	public void setLangCode(int langCode) {
		this.langCode = langCode;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Description [langCode=" + langCode + ", text=" + text + "]";
	}
	
	

}
