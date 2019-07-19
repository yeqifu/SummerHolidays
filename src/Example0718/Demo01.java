package Example0718;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		//使用泛型迭代器来遍历集合
		
		//1.声明一个泛型集合
		List<String> list=new ArrayList<>();
		
		//2.添加元素
		list.add("Scarlett Johansson");
		list.add("Elizabeth Olsen");
		list.add("Anne Hathaway");
		
		//通过泛型迭代器进行遍历
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
