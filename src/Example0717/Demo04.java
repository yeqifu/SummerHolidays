package Example0717;

import java.util.LinkedList;

public class Demo04 {
	public static void main(String[] args) {
		//使用LinkedList模拟栈数据结构
		/**
		 * 分析：
		 * 1.栈(Stack)的特点:先进后出
		 * 2.栈的功能：进栈，出栈
		 * 
		 * 代码：
		 * 1.栈(用一个类表示)
		 * 2.这个类中有两个方法，分别是出栈和进栈
		 */
		Stack stack=new Stack();
		stack.in("刘备");
		stack.in("关羽");
		stack.in("张飞");
		System.out.println("stack"+stack.list);
		stack.out();
		System.out.println("stack"+stack.list);
	}
}
class Stack{
	
	//声明LinkedList对象
	LinkedList list=new LinkedList();
	
	public void in(Object obj) {
		list.addFirst(obj);
	}
	public Object out() {
		return list.removeFirst();
	}
}
