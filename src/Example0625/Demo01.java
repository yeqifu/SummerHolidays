package Example0625;

public class Demo01 {
	public static void main(String[] args) {
		Phone p=new Phone("xiaomi", 2999);
		p.show();
	}
}
class Phone{
	private String brand;
	private int price;
	public Phone() {
		
	}
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void show() {
		System.out.println("手机的品牌为："+brand+","+"手机的价格为："+price);
	}
}

