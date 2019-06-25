package Example0625;

public class Demo03 {
	public static void main(String[] args) {
		Employee e=new Employee("张三", 1, 1000000);
		e.show();
	}
}
class Employee{
	private String name;
	private int id;
	private int salary;
	public Employee() {
		
	}
	public Employee(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void show() {
		System.out.println("员工姓名为："+name+",员工编号为："+id+",员工薪资为："+salary);
	}
	
}
