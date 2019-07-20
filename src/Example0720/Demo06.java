package Example0720;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * LinkedHashSet:
		 * 1.LinkedHashSet是一个具有可预知迭代顺序的Set接口
		 * 2.内部实现是使用哈希表和链接列表
		 * 3.LinkedHashSet的特点是可以保证怎么存就怎么取
		 * 4.LinkedHashSet是set集合中唯一一个能保证怎么存就怎么取的集合对象
		 * 5.LinkedHashSet是HashSet的子类，所以也是保证元素唯一的，与HashSet的原理一样
		 */
		
		Set<Student> set=new LinkedHashSet<Student>();
		set.add(new Student("Scarlett Johansson",30));
		set.add(new Student("Elizabthe Olsan",30));
		set.add(new Student("Anne hathaway",30));
		set.add(new Student("刘备",40));
		for(Student a:set) {
			System.out.println(a);
		}
		
		//声明泛型迭代器
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
