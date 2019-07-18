package Example0717;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
	public static void main(String[] args) {
		//案例:去除ArrayList中重复字符串元素
		
		List list=new ArrayList();
		list.add("龙族");
		list.add("九州缥缈录");
		list.add("天之炽");
		list.add("龙族");
		System.out.println("list"+list.toString());

		//创建一个新集合
		List list2=new ArrayList();
		
		//取list集合中的元素
		for(int i=0;i<list.size();i++) {
			//取元素
			Object obj=list.get(i);
			if(!list2.contains(obj)) {	//判断集合在新元素中不存在
				list2.add(obj);
			}
		}
		System.out.println(list2);
	}
}
