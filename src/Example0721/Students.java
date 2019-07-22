package Example0721;

import java.util.Comparator;

public class Students implements Comparable<Students>{
	private String name;
	private int chinese;
	private int math;
	private int english;
	private int totalScore;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.totalScore=chinese+math+english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Demo07 [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english
				+ ", totalScore=" + totalScore + "]";
	}
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		//总分  由大到小
		int num=o.totalScore-this.totalScore;
		
		//如果总分一样，就按照名字排序
		num=num==0?this.name.compareTo(o.name):num;
		
		//同名的学生可能没法排序
		num=num==0?1:num;
		return num;
	}
	
	
	
}
