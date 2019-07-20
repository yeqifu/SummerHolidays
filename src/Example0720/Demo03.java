package Example0720;

import java.util.HashSet;
import java.util.Set;

public class Demo03 {
	public static void main(String[] args) {
		//HashSet存储自定义对象保证元素的唯一性
		/*
		 * 思路：需要重写hashCode()和equals()方法
		 * 
		 * hashset在存储数据时，数据hashcode不一样会直接存储
		 * 如果一样，会进行比较，调用equals方法，如果返回true就不会存储
		 */
		Set<Student> set=new HashSet<Student>();
		set.add(new Student("张三",18));
		set.add(new Student("李四",18));
		set.add(new Student("张三",18));
		set.add(new Student("王五",18));
		set.add(new Student("李四",18));
		set.add(new Student("李四",18));
		System.out.println(set); 
	}
}
