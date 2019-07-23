package Example0722;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
	public static void main(String[] args) {
		//Map集合的遍历一（键找值）
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "Scarlett Johansson");
		map.put("gender", "female");
		map.put("age", "30");
		
		//遍历
		Set<String> keys=map.keySet();
		for(String key:keys) {
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
