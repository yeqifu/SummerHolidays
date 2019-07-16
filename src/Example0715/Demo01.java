package Example0715;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		//Collection集合的基本功能
		/*
		 * 基本功能方法
		 * boolean add(E e) 添加元素    （泛型）
		 * boolean remove(Object o)	移除集合中的元素
		 * void clear()	清空集合中的元素
		 * boolean contains(Object o) 判断是否包含某一个元素
		 * boolean isEmpty() 集合是否为空
		 * int size() 返回集合的大小
		 */
		
		//创建一个集合对象
		Collection coll=new ArrayList();	//接口回调，多态
		
		//添加元素
		coll.add("java");
		coll.add("c");
		coll.add("javascript");
		coll.add("python");
		System.out.println(coll);  //ArrayList()自己实现了toString方法
		
		//移除集合中的元素
		coll.remove("javascript");
		System.out.println(coll);
		
		//判断集合中是否包含某一种元素
		System.out.println(coll.contains("c"));
		
		//判断集合是否为空
		System.out.println(coll.isEmpty());
		
		//返回集合的大小
		System.out.println(coll.size());
		
		//清空集合中的元素
		coll.clear();
		System.out.println(coll);
	}
}
