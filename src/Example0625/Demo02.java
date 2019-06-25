package Example0625;

public class Demo02 {
	public static void main(String[] args) {
		Rectangle p=new Rectangle();
		p.setChang(5);
		p.setWide(5);
		double zhouchang=p.Perimeter();
		System.out.println("长方形的周长为："+zhouchang);
		double area=p.Area();
		System.out.println("长方形的面积为："+area);
	}
}
class Rectangle{
	private double chang;
	private double wide;
	public Rectangle() {
		
	}
	public Rectangle(double chang, double wide) {
		this.chang = chang;
		this.wide = wide;
	}

	public double getChang() {
		return chang;
	}

	public void setChang(double chang) {
		this.chang = chang;
	}

	public double getWide() {
		return wide;
	}

	public void setWide(double wide) {
		this.wide = wide;
	}

	public double Perimeter() {
		double zhouchang=2*(chang+wide);
		return zhouchang;
	}
	public double Area() {
		double area=chang*wide;
		return area;
	}
}