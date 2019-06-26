package Example0626;

public class Demo05 {
	public static void main(String[] args) {
		Student1 stu=new Student1("落亦",20);
		stu.eat();
		stu.study();
		
		Teacher1 tea=new Teacher1("魏启明",40);
		tea.eat();
		tea.teach();
	}
}
class Person1{
	String name;
	int age;
	public Person1() {
		
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("吃饭...");
	}
	
}
class Student1 extends Person1{
	public Student1(String name,int age) {
		
	}
	public void study(){
		System.out.println("学习...");
	}
}
class Teacher1 extends Person1{
	public Teacher1(String name,int age) {
		
	}
	public void teach() {
		System.out.println("讲课...");
	}
}
