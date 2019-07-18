package Example0717;

import java.util.ArrayList;
import java.util.List;

/**
 * contains方法的本质
 * 1.如果是判断字符串在集合中是否存在，比较的是字符串的内容
 * 2.如果是判断自定义对象在集合中是否存在，比较的是对象的地址
 * 3.调用contains方法，内部会调用equals方法
 * @author YQF
 *
 */

public class Demo03 {
	public static void main(String[] args) {
		//去除ArrayList中重复的自定义对象元素
		//思路：创建一个新集合，并且重写对象的equals方法
		
		//1.声明一个list对象
		List list=new ArrayList();
		//2.添加元素
		list.add(new Student("刘备",30));
		list.add(new Student("关羽",28));
		list.add(new Student("张飞",27));
		list.add(new Student("关羽",28));
		
		System.out.println(list);
		
		//3.声明一个新集合
		List list2=new ArrayList();
		
		//遍历list
		for(int i=0;i<list.size();i++) {
			Object obj=list.get(i);
			if(!list2.contains(obj)) {
				list2.add(obj);
			}
		}
		System.out.println("list2"+list2);
		
	}
}
