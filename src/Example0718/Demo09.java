package Example0718;

import java.util.Arrays;
import java.util.List;

public class Demo09 {
	public static void main(String[] args) {
		//Arrays工具类的asList()方法的使用
		
		//T... a 泛型参数
		//asList:把参数转成集合
		List<String> list1=Arrays.asList("Scarlett","Olsan","Anne");
		System.out.println(list1);
		
		List<Student> list2=Arrays.asList(new Student("Johansson",30),new Student("Elizabthe",30),new Student("Hanthaway",30));
		System.out.println(list2);
	}
}
