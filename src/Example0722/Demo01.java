package Example0722;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
	public static void main(String[] args) {
		//Map集合的功能概述(map是一个接口，一般使用HashMap)
		
		//声明一个map对象
		Map<String, String> map=new HashMap<String,String>();
		
		/*1.添加功能
		 *  V put(K key,V value):添加元素
		 *	如果键是第一次存储，就直接存储元素，返回null
		 *	如果键不是第一次存储，就用现在的值把以前的值替换掉，并且返回以前的值
		*/
		String s=map.put("姓名", "Scarlett Johansson");
		System.out.println(s);
		String s2=map.put("姓名", "Elizabthe Olsan");
		System.out.println(s2);
		System.out.println(map);
		
		/*
		 * 2.删除功能
		 * void clear():移除所有的键值对元素
		 * V remove(Object key):根据键删除键对应的值，并把原来的值返回
		 */
		map.clear();
		System.out.println(map);
		map.put("age", "30");
		String age=map.remove("age");
		System.out.println(age);
		
		/*
		 * 3.判断功能
		 * boolean containsKey(Object key):判断集合是否包含指定的键
		 * boolean containsValue(Object value):判断集合是否包含指定的值
		 * boolean isEmpty():判断集合是否为空
		 */
		boolean b=map.containsKey("age");
		System.out.println(b);
		map.put("gender", "female");
		boolean b2=map.containsKey("gender");
		System.out.println(b2);
		boolean b3=map.containsValue("female");
		System.out.println(b3);
		boolean b4=map.isEmpty();
		System.out.println(b4);
		
		/*
		 * 4.获取功能
		 * V get(Object key):根据键获取值
		 * Set<K> keySet():获取集合中所有键的集合
		 * Collection<V> values():获取集合中所有值的集合
		 */
		
		map.put("salary", "10000000");
		
		String sex=map.get("gender");
		System.out.println(sex);
		
		Set<String> sets=map.keySet();
		System.out.println(sets);
		
		Collection<String> collection=map.values();
		System.out.println(collection);
		
		/*
		 * 5.长度功能
		 * int size():返回集合中的键值对的个数
		 */
		int num=map.size();
		System.out.println(num);
	}
}
