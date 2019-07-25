package Example0723;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo05 {
	public static void main(String[] args) {
		//面试题:HashMap和Hashtable的区别
		/*
		 * 1.Hashtable是JDK1.O版本出现的，是线程安全的，效率低，有加锁
		 * 2.HashMap是JDK1.2版本出现的，是线程不安全的，效率高
		 * 3.Hashtable不可以存储null键和null值
		 * 4.HashMap可以存储null键和null值
		 */
		
		//HashMap对象
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("name", "Scarlett Johansson");
		map.put("age", "30");
		map.put(null, null);
		System.out.println(map);
		
		//Hashtable对象
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("gender", "female");
		table.put(null, null);
		System.out.println(table);
	}
}
