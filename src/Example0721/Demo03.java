package Example0721;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo03 {
	public static void main(String[] args) {
		//TreeSet存储自定义对象
		/*
		 * 1.TreeSet构造函数什么都不传，默认按照类中Comparable的顺序(没有就报错ClassCastException)
		 * 2.TreeSet如果传入Comparator,就优先按照Comparator
		 */
		Set<Student> set=new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
		});
		set.add(new Student("刘备",29));
		set.add(new Student("关羽",28));
		set.add(new Student("张飞",27));
		for(Student stu:set) {
			System.out.println(stu);
		}
		
	}
}
class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}

	
}