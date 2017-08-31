package mapImplementations;

public class KeyWordsStyles {
	private String color;
	private String style;
	private String font;
	public KeyWordsStyles(String colors, String styles, String font) {
		super();
		this.setColor(colors);
		this.setStyle(styles);
		this.setFont(font);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getFont() {
		return font;
	}
	public void setFont(String font) {
		this.font = font;
	}
	
	

}
