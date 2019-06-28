package Example0628;

public class Demo03 {
	public static void main(String[] args) {
		JichuTeacher jiuchu = new JichuTeacher("GYF",30);
		jiuchu.teach();
		JiuyeTeacher jiuye = new JiuyeTeacher("WQM",10);
		jiuye.teach();
	}
}

abstract class Teacher {
	String name;
	int age;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void teach();
}

class JichuTeacher extends Teacher {

	public JichuTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(name+","+age);
		System.out.println("讲授基础内容...");
	}

}

class JiuyeTeacher extends Teacher {
	public JiuyeTeacher(String name,int age) {
		super(name,age);
	}
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(name+","+age);
		System.out.println("讲授就业内容....");
	}

}
