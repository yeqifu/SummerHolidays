package Example0723;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * LinkedHashMap的概述和使用
		 * LinkedHashMap的特点：底层是链表实现的可以保证怎么存就怎么取
		 * HashMap的存和取的顺序是不一样的
		 */
		//Map<String,String> map=new HashMap<String,String>();
		
		Map<String,String> map=new LinkedHashMap<String,String>();
		
		map.put("刘备", "蜀国");
		map.put("孙权", "吴国");
		map.put("曹操", "魏国");
		map.put("张飞", "蜀国");
		
		Set<Entry<String, String>> entry=map.entrySet();
		for(Entry<String,String> entries:entry) {
			String key=entries.getKey();
			String values=entries.getValue();
			System.out.println(key+":"+values);
		}
		
	}
}
