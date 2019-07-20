package Example0720;

import java.util.Set;
import java.util.TreeSet;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * TreeSet:
		 * 		1.TreeSet是一个可以用于排序的集合
		 * 		2.TreeSet:基于TreeMap的NavigableSet实现
		 * 		3.TreeSet的排序方法有两种
		 * 			a>使用元素的自然顺序对元素进行排序
		 * 			b>使用构造方法的Comparator进行排序
		 * TreeSet存储数字，会自然排序（由小到大）
		 * TreeSet存储字符串，会自然排序（由小到大）
		 */
		
		Set<Integer> set=new TreeSet<Integer>();
		set.add(50);
		set.add(20);
		set.add(16);
		set.add(99);
		for(Integer num:set) {
			System.out.println(num);
		}
		
		
		System.out.println("=======================");
		
		Set<String> set2=new TreeSet<String>();
		set2.add("abc");
		set2.add("adblde");
		set2.add("dfldjfl");
		set2.add("ioujpojdfv");
		for(String str:set2) {
			System.out.println(str);
		}
	}
}
