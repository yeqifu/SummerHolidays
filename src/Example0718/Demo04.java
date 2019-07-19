package Example0718;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
	public static void main(String[] args) {
		//泛型高级之通配符
		/**
		 * 1.泛型通配符<?>
		 * 可以是java的任意类型
		 */
		List<String> list=new ArrayList<String>();
		list.add("落亦");
		list.add("佳上");
		list.add("李约素");
		Demo04.print(list);
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(new Student("Scarlett Johansson",30));
		list2.add(new Student("Elizabeth Olsen",30));
		list2.add(new Student("Anne Hathaway",30));
		Demo04.print(list2);
		
		
		//2.? extends E [E是父类，?是子类]
		//向下限定，E及其子类
		
		//3.? super E [?是父类，E是子类]
		//向上限定，E及其父类
	}
	public static void print(List<?> list) {
		System.out.println(list);
	}
}

