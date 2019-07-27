package Example0725;

public class Demo12 {
	public static void main(String[] args) throws Exception {
		/*
		 * 自定义异常可以使代码更直观
		 * 写自定义异常的步骤：
		 * 1.写一个类(AgeException)继承Exception,这种是编译时异常
		 * 2.在子类异常AgeException提供一个带字符串参数的构造方法
		 * 		public AgeException(String msg){
		 * 			super(msg);
		 * 		}
		 * 3.自定义异常时，也可以继承RuntimeException,这种是运行时异常
		 */
		
		Teacher p=new Teacher();
		p.setAge(190);
		
	}
}
class Teacher{
	int age;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException{
		if(age>=1&&age<=150) {
			this.age=age;
		}else {
			throw new AgeException("年龄不正常");
		}
	}
	
}

class AgeException extends Exception{
	public AgeException(String msg) {
		super(msg);
	}
}