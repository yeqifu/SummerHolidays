package Example0718;

import java.util.ArrayList;
import java.util.List;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * 案例演示：集合嵌套之List嵌套List
		 * 案例需求：
		 * 1.一个班的n个学生是一个集合
		 * 2.一个学校的n个班也是一个集合
		 * 3.如何将这些数据用一个集合来表示
		 */
		
		//1.用集合来表示2个班级
		List<Student> grade1=new ArrayList<Student>();
		grade1.add(new Student("刘备",20));
		grade1.add(new Student("关羽",20));
		grade1.add(new Student("张飞",20));
		
		List<Student> grade2=new ArrayList<Student>();
		grade2.add(new Student("小刘",20));
		grade2.add(new Student("小关",20));
		grade2.add(new Student("小张",20));
		
		//2.用集合来表示学校school
		List<List<Student>> school=new ArrayList<List<Student>>();
		school.add(grade1);
		school.add(grade2);
		
		//3.遍历班级
		for(List<Student> stus:school) {
			System.out.println("班级...");
			//4.遍历学生
			for(Student stu:stus) {
				System.out.println(stu);
			}
		}
		
		
		
	}
}
