package Example0721;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo02 {
	public static void main(String[] args) {
		//字符串排序
		//字符串正常排序
//		Set<String> set=new TreeSet<String>();
		
		Set<String> set=new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num=o2.compareTo(o1);//字母倒序
				num=num==0?1:num;		//让同名的水果也能存
				return num;
			}
		});
		set.add("banana");
		set.add("apple");
		set.add("orange");
		set.add("apple");
		for(String fruit:set) {
			System.out.println(fruit);
		}
	}
}
//class MyComparator2 implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		return o2-o1;
//	}
//	
//}