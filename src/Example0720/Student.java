package Example0720;

public class Student implements Comparable<Student>{
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
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		//return 1;
//		return this.name.hashCode();
//	} 
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		System.out.println("..............");
//		Student other=(Student)obj;
//		return this.age==other.age&&this.name==other.name;
//	}
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num=this.age-o.age;
		
		System.out.println(this.name+"..比较..."+o.name);
		//HashSet 去除重复元素写hashCode和equals方法
		//TreeSet 去除重复元素，以前写hashCode和equals方法不起作用
		if(num==0) {
			num=1;
		}

		return num;
	}
	
	
	
}
