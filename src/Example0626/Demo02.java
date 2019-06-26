package Example0626;

public class Demo02 {

	public static void main(String[] args) {
		Student s=new Student("张三", "B1732");
	}

}
class Student{
	String name;
	String className;
	public Student(String name,String className){
		System.out.println("我是："+name+"来自："+className);
	}
	{
		System.out.println("你好！");
	}
}