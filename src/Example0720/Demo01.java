package Example0720;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * Set:接口
		 * 1.一个不包含重复元素的collection
		 * 2.最多包含一个null元素
		 * 3.Set集合存和取的顺序不一样
		 * 4.一般使用它的实现类：HashSet,LinkedHashSet,TreeSet
		 *
		 * List:接口
		 * 1.List是可以存储多个相同元素的
		 * 2.List的存和取的元素是一样的
		 */
		
		List<String> list=new ArrayList<String>();
		list.add("luoyi");
		list.add("jiashang");
		list.add(null);
		list.add("liyuesu");
		list.add(null);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println(list);
		
		Set<String> set=new HashSet<String>();
		set.add("Scarlett Johansson");
		set.add("Elizabthe Olsan");
		set.add("Anne Hathaway");
		set.add(null);
		set.add("Scarlett Johansson");
		//set.add(null);  最多只包含一个null元素
		
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println(set);
	}
	
	
}
