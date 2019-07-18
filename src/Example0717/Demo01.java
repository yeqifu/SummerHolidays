package Example0717;

import java.util.Enumeration;
import java.util.Vector;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 1.Vector介绍
		 * 此类改进为可以实现List接口，
		 * 使它成为Java Collections Framework的成员，Vector是同步的
		 * 
		 * 2.方法
		 * public void addElement(E obj)  往集合中添加一个元素
		 * public E elementAt(int index)  获取index位置的元素
		 * public Enumeration elements()  遍历元素
		 * 
		 * 3.Vector很少用，加锁，性能较低
		 */
		
		//创建一个集合对象
		Vector vector=new Vector();
		
		//添加元素
		vector.addElement("龙族");
		vector.addElement("九州缥缈录");
		vector.addElement("天之炽");
		
		//取元素
		System.out.println(vector.elementAt(2));
		System.out.println("=================");
		
		//遍历Vector集合
		//注意：取名是不要用enum，因为enum是一个关键字
		//Enumeration:枚举
		Enumeration enumeration=vector.elements();
		while(enumeration.hasMoreElements()) {
			Object obj=enumeration.nextElement();
			System.out.println(obj);
		}
		
	}
}
