package Example0718;

import java.util.ArrayList;
import java.util.Collection;

public class Demo10 {
	public static void main(String[] args) {
		//Collection中toArray(T[] a)泛型版的集合数组
		//将集合中的元素存储到数组中
		Collection<String> col=new ArrayList<String>();
		col.add("刘备");
		col.add("关羽");
		col.add("张飞");
		//声明一个字符串数组
		String[] strs=new String[3];
		for(String s:strs) {
			System.out.println(s);
		}
		System.out.println("==================");
		
		col.toArray(strs);
		
		for(String s:strs) {
			System.out.println(s);
		}
	}
}
