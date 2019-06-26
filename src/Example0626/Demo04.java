package Example0626;

public class Demo04 {
	public static void main(String[] args) {
		
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
}
class Teacher extends Person{
//	public Teacher(){
//		super();//因为父类没有无参的构造方法，所以会报错，子类可以调用父类有参的构造方法
//		super("张三",20);	
//	}
	public Teacher(String name,int age) {
		super(name,age);
	}
}
