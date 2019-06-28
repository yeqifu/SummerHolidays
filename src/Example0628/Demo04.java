package Example0628;

public class Demo04 {
	public static void main(String[] args) {
		Programmer p=new Programmer("张三", 10, 10000);
		p.show();
		Manager m=new Manager("大飞", 15, 10000,1000);
//		m.reward=1000;
		m.show();
	}
}

abstract class Employee{
	String name;
	int num;
	double salary;
	
	public Employee(String name, int num, double salary) {
		super();
		this.name = name;
		this.num = num;
		this.salary = salary;
	}

	public abstract void show();
}
class Programmer extends Employee{

	
	public Programmer(String name, int num, double salary) {
		super(name, num, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		System.out.println("苦逼的:"+name+"	工号为:"+num+"	工资为:"+salary);
	}
	
}

//项目经理继承员工类
/*class Manager extends Employee{
	double reward;
	public Manager(String name, int num, double salary) {
		super(name, num, salary);
		// TODO Auto-generated constructor stub
	}
	public Manager(String name,int num, double salary,double reward) {
		super(name,num,salary);
		this.reward=reward;
	}
	@Override
	public void show() {
		System.out.println("舒服的:"+name+"	工号为:"+num+"	工资为:"+salary+"	奖金为:	"+reward);
	}
	
}*/

//项目经理还可以继承程序员类
class Manager extends Programmer{
	double reward;
	public Manager(String name, int num, double salary,double reward) {
		super(name, num, salary);
		this.reward=reward;
		// TODO Auto-generated constructor stub
	}
	public void show() {
		super.show();
		System.out.println("奖金为:"+reward);
	}
	
}