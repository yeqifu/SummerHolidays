package Example0722;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 案例：HashMap集合键是Student,值是String
		 * 键是学生对象，代表每一个学生
		 * 值是字符串对象，代表学生归属地
		 */
		/*
		 * 注意事项：
		 * 1.打印的key是student的toString方法返回的字符串
		 * 2.如果key相同，会把前面的值替换掉，但是必须是同一个对象
		 * 3.HashMap是无序的
		 * 4.new出来的都不是相同的key,因为地址不同。如果属性一样，想替换前面对应属性一样的values时，需要重写equals和hashCode方法 
		 */
		
		Map<Student,String> map=new HashMap<Student,String>();
		map.put(new Student("Scarlett Johansson",30),"American");
		map.put(new Student("Elizabthe Olsan",29),"England");
		map.put(new Student("Anne Hathaway",28), "Britain");
		
		//Student stu=new Student("Scarlett Johansson",30);
		//map.put(stu,"chinese");
		//map.put(stu,"American");
		
		
		
		Set<Entry<Student, String>> entries=map.entrySet();
		for(Entry<Student,String> entry: entries) {
			Student key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
	}
}
class Student{
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
