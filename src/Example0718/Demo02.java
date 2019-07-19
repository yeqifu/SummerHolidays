package Example0718;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		//使用泛型ArrayList存储学生对象并遍历
		
		//1.声明泛型集合
		List<Student> list=new ArrayList<Student>();
		
		//2.往泛型集合中添加元素
		list.add(new Student("Scarlett Johansson",30));
		list.add(new Student("Elizabeth Olsen",30));
		list.add(new Student("Anne Hathaway",30));
		 
		//3.声明一个泛型迭代器
		Iterator<Student> iterator=list.iterator();
		
		//4.循环遍历输出
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
