package Example0723;

import java.util.HashMap;
import java.util.Map;

public class Demo03 {
	public static void main(String[] args) {
		//案例：统计字符串中每个字符出现的次数
		String str="aaabbbbbccc";
		
		//1.创建存储字符串的集合map
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		//2.遍历字符串
		for(int i=0;i<str.length();i++) {
			char s=str.charAt(i);
			//2.1如果map中没有这个字符
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				//2.2如果map中包含这个字符
				map.put(s, map.get(s)+1);
			}
		}
		System.out.println(map);
	}
}
