package Example0723;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo02 {
	public static void main(String[] args) {
		//案例：TreeMap集合  键是Student 值是String
		/*
		 * TreeMap对Key进行排序
		 */
		//test1();
		//test2();
		
		test3();
	}
	
	//使用Comparator进行TreeMap的Key排序
	private static void test3() {
		Map<Studentss,String> map=new TreeMap<Studentss,String>(new Comparator<Studentss>() {

			@Override
			public int compare(Studentss o1, Studentss o2) {
				// TODO Auto-generated method stub
				//按名字字母的倒序排序
				int num=o2.getName().compareTo(o1.getName());
				//同名的可以存储
				num=num==0?1:num;
				return num;
			}
		});
		map.put(new Studentss("Scarlett Johansson",30),"American");
		map.put(new Studentss("Elizabthe Olsan",29),"England");
		map.put(new Studentss("Anne Hathaway",28),"American");
		map.put(new Studentss("Tom Hiddleston",30),"American");
		map.put(new Studentss("Tom Hiddleston",30),"American");
		
		Set<Entry<Studentss, String>> entry=map.entrySet();
		for(Entry<Studentss,String> entries:entry) {
			Studentss key=entries.getKey();
			String values=entries.getValue();
			System.out.println(key+":"+values);
		}
	}
	
	//使用Comparable进行TreeMap的key排序
	private static void test2() {
		Map<Studentss,String> map=new TreeMap<Studentss,String>();
		map.put(new Studentss("Scarlett Johansson",30),"American");
		map.put(new Studentss("Elizabthe Olsan",29),"England");
		map.put(new Studentss("Anne Hathaway",28),"American");
		map.put(new Studentss("Tom Hiddleston",30),"American");
		
		
		Set<Entry<Studentss, String>> entry=map.entrySet();
		for(Entry<Studentss,String> entries:entry) {
			Studentss key=entries.getKey();
			String values=entries.getValue();
			System.out.println(key+":"+values);
		}
	}

	private static void test1() {
		Map<String,String> map=new TreeMap<String,String>();
		
		map.put("d刘备", "蜀国");
		map.put("c孙权", "吴国");
		map.put("a曹操", "魏国");
		map.put("b张飞", "蜀国");
		
		Set<Entry<String, String>> entry=map.entrySet();
		for(Entry<String,String> entries:entry) {
			String key=entries.getKey();
			String values=entries.getValue();
			System.out.println(key+":"+values);
		}
	}
}
class Student implements Comparable<Studentss>{
	private String name;
	private int age;
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
	public int compareTo(Studentss o) {
		// TODO Auto-generated method stub
		//按字母排序
		int num=this.name.compareTo(o.getName());
		//允许同名存储
		num=num==0?1:num;
		return num;
	}
	
}
