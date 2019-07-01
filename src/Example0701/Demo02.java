package Example0701;

/**
 * 重写父类的equals方法，改变这个方法的比较规则
 * 默认情况下equals的比较规则是比较两个对象的地址
 * 重写后，可以根据属性是否一样来返回boolean值
 * @author YQF
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		MilkTea2 m1=new MilkTea2("椰果",7);
		MilkTea2 m2=new MilkTea2("椰果",7);
		
		//判断m1和m2是否是同一种奶茶
		//第一种方法
		if(m1.getSource().equals(m2.getSource())&&m2.getPrice()==m1.getPrice()) {
			System.out.println("m1和m2是同种奶茶!");
		}else {
			System.out.println("m1和m2不是同一种奶茶!");
		}
		
		//第二种方法，重写equals方法 
		System.out.println("m1和m2是否为同一个人:"+m1.equals(m2));
	}
}
class MilkTea2 {
	private String source;
	private int price;
	
	public MilkTea2() {
		super();
	}
	public MilkTea2(String source, int price) {
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
	public boolean equals(Object obj) {
		//把obj还原为Student
		MilkTea2 other=(MilkTea2)obj;
		return this.getSource().equals(other.getSource())&&this.getPrice()==other.getPrice();
		
//		return super.equals(obj); 默认父类比较的两个对象的地址
	}
	
}