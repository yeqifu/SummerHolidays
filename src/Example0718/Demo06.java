package Example0718;

import java.util.ArrayList;
import java.util.List;

public class Demo06 {
	public static void main(String[] args) {
		StudentDao stuDao=new StudentDao();
		System.out.println(stuDao.findList());
	}
}


/**
 * 声明一个数据访问层的泛型接口
 * 1.接口中一般都定义方法
 * @author YQF
 *
 * @param <T>
 */
interface DaoInterface<T>{
	public List<T> findList();	//查找表的所有信息
	public T findByName(String name);  //根据名字查询信息
	public void update(T t);  //修改信息
}

//泛型接口的实现类
class StudentDao implements DaoInterface<Student>{

	@Override
	public List<Student> findList() {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Scarlett Johansson",30));
		list.add(new Student("Elizabthe Olsan",30));
		list.add(new Student("Anne Hathaway",30));
		return list;
	}

	@Override
	public Student findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student t) {
		// TODO Auto-generated method stub
		
	}
	
}

class EmployeeDao implements DaoInterface<Employee>{

	@Override
	public List<Employee> findList() {
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Scarlett-- Johansson",30000));
		list.add(new Employee("Elizabthe-- Olsan",30000));
		list.add(new Employee("Anne-- Hathaway",30000));
		return list;
	}

	@Override
	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Employee t) {
		// TODO Auto-generated method stub
		
	}
	
}

