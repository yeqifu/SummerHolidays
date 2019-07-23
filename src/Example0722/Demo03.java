package Example0722;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo03 {
	public static void main(String[] args) {
		//Map集合的遍历二（键值对对象找键和值）
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "Scarlett Johansson");
		map.put("gender", "female");
		map.put("age", "30");
		
		//java.util.Map.Entry
		/*
		 * Entry:称为键值对 对象
		 */
		Set<Entry<String,String>> entries=map.entrySet();
		
		//通过for循环进行遍历
//		for(Entry<String,String> entry:entries) {
//			String key=entry.getKey();
//			String value=entry.getValue();
//			System.out.println(key+":"+value);
//		}
		
		//通过迭代器进行遍历
		Iterator<Entry<String, String>> iterator=entries.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> entry=iterator.next();
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
