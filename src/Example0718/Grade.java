package Example0718;

public class Grade {
	private String name;
	private int num;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Grade [name=" + name + ", num=" + num + "]";
	}
	
}
