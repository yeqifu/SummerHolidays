package Example0723;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo09 {
	 public static void main(String[] args) {
		 /*
		  * 1.泛型固定上边界
		  * [? extends E]----表示泛型固定上边界
		  * 	?表示子类，E表示父类
		  * ArrayList.addAll(Collection<? extends Person> c)
		  * 
		  * 2.泛型固定下边界
		  * [? super E]------表示泛型固定下边界
		  * 	?表示父类，E表示子类
		  *   ArrayList.sort(Comparator<? super Studentss> c)
		  * 
		  * ? extends E 针对存的操作
		  * ? super E 针对取的操作  
		  */
		 
		 //test1();
		 List<Studentss> list=new ArrayList<Studentss>();
		 
		 list.add(new Studentss("E",9));
		 list.add(new Studentss("F",10));
		 list.add(new Studentss("G",16));
		 list.add(new Studentss("H",5));
		 
		 /*
		  * Comparator<? super Studentss> c
		  * Comparator中的泛型可以是Studentss,也可以是Studentss的父类Person
		  */
		/* list.sort(new Comparator<Studentss>() {

			@Override
			public int compare(Studentss o1, Studentss o2) {
				// TODO Auto-generated method stub
				return o1.getAge()-o2.getAge();
			}
		});*/
		 
		 list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
		});
		 
		 for(Studentss stu:list) {
			 System.out.println(stu);
		 }
	}

	private static void test1() {
		List<Person> list1=new ArrayList<Person>();
		 list1.add(new Person("A",5));
		 list1.add(new Person("B",6));
		 /*
		  * Collection<? extends Person> c
		  * 这个集合可以存Person,也可以存Person的子类类型
		  */
		 List<Person> list2=new ArrayList<Person>();
		 list2.add(new Person("C",7));
		 list2.add(new Person("D",8));
		 
		 List<Studentss> list3=new ArrayList<Studentss>();
		 list3.add(new Studentss("E",9));
		 list3.add(new Studentss("F",10));
		 
		 list1.addAll(list2);
		 list1.addAll(list3);
		 
		 //遍历list1
		 for(Person person:list1) {
			 System.out.println(person);
		 }
	}
}
class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
class Studentss extends Person{

	public Studentss(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
}
