package Example0701;

public class MilkTea {
	private String source;
	private int price;
	
	public MilkTea() {
		super();
	}
	public MilkTea(String source, int price) {
		super();
		this.source = source;
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MilkTea [source=" + source + ", price=" + price + "]";
	}
	
}
