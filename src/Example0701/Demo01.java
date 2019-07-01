package Example0701;

public class Demo01 {
	public static void main(String[] args) {
		MilkTea2 a=new MilkTea2("珍珠",7);
		//直接打印一个对象的时候，会调用object的toString方法
		System.out.println(a);
		System.out.println(a.toString());
	}
	

}
