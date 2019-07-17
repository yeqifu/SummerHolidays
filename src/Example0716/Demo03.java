package Example0716;

import java.util.ArrayList;
import java.util.List;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * 集合遍历的方式
		 * 1.把集合转换成数组
		 * 2.使用集合中的迭代器
		 * 3.通过List的size()和get()方法结合来遍历List集合
		 * 
		 */
		List list=new ArrayList();
		list.add(new Student("张三",25));
		list.add(new Student("李四",25));
		list.add(new Student("王五",25));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
