package Example0725;

public class Demo08 {
	public static void main(String[] args) throws Exception {
		//throws的方式处理异常
		/*
		 * 自己处理异常：
		 * 1.try-catch
		 * 2.try-catch-catch(多个catch)
		 * 3.throws
		 * 
		 * 实现方式：
		 *  1.定义功能方法是，需要把出现的问题暴露出来让调用者去处理
		 *  	调用者可以try-catch来处理
		 *  	调用者也可以往上一级throws
		 */
		
		/*
		 * throw的概述以及和throws的区别
		 * 
		 * throw的使用场景
		 * 在方法内部出现某种情况，程序不能继续运行，就用throw把异常对象抛出
		 * 
		 * throws和throw的区别
		 * throws
		 * 用在方法声明后面，跟的是异常类名
		 * 可以跟多个异常类名，用逗号隔开
		 * 它表示抛出异常，由该方法的调用者来处理
		 * throw
		 * 用在方法体内，跟的是异常对象名
		 * 只能抛出一个异常对象名，表示抛出异常
		 */
		Teacher p=new Teacher();
		
		p.setAge(-80);
//		try {
//			p.setAge(-90);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
}

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age>=1&&age<=150) {
			this.age = age;
		}else {
			throw new Exception("年龄错误！");
		}
		
	}
	private void say() {
		System.out.println("我今年"+age);
	}
}