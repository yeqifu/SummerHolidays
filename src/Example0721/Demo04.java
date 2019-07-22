package Example0721;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 案例：在一个集合中存储了无序并且重复的字符串
		 * 		 让其有序(字典顺序)，而且还不能去除重复
		 */
		Set<String> names=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int num=o1.compareTo(o2);//由小到大
				num=num==0?1:num;//保存同名元素
				return num;
			}
		});
		names.add("banana");
		names.add("apple");
		names.add("orange");
		names.add("apple");
		for(String fruit:names) {
			System.out.println(fruit);
		}
	}
}
