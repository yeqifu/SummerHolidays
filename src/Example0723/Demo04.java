package Example0723;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo04 {
	public static void main(String[] args) {
		//集合嵌套之HashMap嵌套HashSet
		/*
		 * 需求：
		 * 一个学校有两班
		 * 一个班有多个学生
		 * 通过HashMap与HashSet来实现数据的存储
		 */
		
		//1.创建两个班(Set)
		Set<Studentss> javaClass=new HashSet<Studentss>();
		javaClass.add(new Studentss("刘备",30));
		javaClass.add(new Studentss("关羽",35));
		javaClass.add(new Studentss("张飞",30));
		
		Set<Studentss> pythonClass=new HashSet<Studentss>();
		pythonClass.add(new Studentss("赵云",30));
		pythonClass.add(new Studentss("黄忠",35));
		
		//2.创建一个学校(Map)
		Map<String,Set<Studentss>> school=new HashMap<>();
		school.put("java",javaClass);
		school.put( "python",pythonClass);
		
		
		//3.遍历
		//3.1遍历学校里的班级
		for(Entry<String,Set<Studentss>> entry:school.entrySet()) {
			System.out.println("班级名称："+entry.getKey());
			//3.2遍历班级里学生
			Set<Studentss> values=entry.getValue();
			for(Studentss stu :values) {
				System.out.println("学生："+stu);
			}
			
		}	
	}
}
class Students{
	private String name;
	private int age;
	public Students(String name, int age) {
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
	
}