package Example0718;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 可变参数
		 * 概述：定义方法时不知道该定义多少个参数
		 * 格式：修饰符  返回值类型  方法名(数据类型...  变量名){}
		 * 注意事项： 1.这里的变量其实是一个数组
		 * 			 2.如果一个方法有可变参数，并且有多个可变参数，那么，可变参数必须是最后一个
		 */
		
		test1(2,new Student("Scarlett Johansson",30),"Elizabthe Olsan");
	}
	
	public static void test1(Object ...object) {
		for(Object obj:object) {
			System.out.println(obj);
		}
	}
	
	public static void test2(String b,int ...a) {  //可边参数必须在后面
		
	}
}
