package Example0718;

/**
 * 1.声明一个泛型类
 * class Tool<T>
 * 2.声明一个泛型方法（无返回值，有泛型参数）
 * public void print(T t)
 * 3.声明一个泛型方法（有返回值，无参数）
 * public T get(int index)
 * 4.声明一个泛型属性
    private T o;	//将T看成一个“占位”
	public T getO() {
		return o;
	}
	public void setO(T o) {
		this.o = o;
	}
 * @author YQF
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//泛型类和泛型方法
		
		//1.使用泛型类创建对象
		Tool<String> tool=new Tool<String>();
		
		//2.使用方法
		tool.print("Scarlett Johansson");
	
		Tool<Student> tool2=new Tool<Student>();
		tool2.print(new Student("Elizabeth Olsen",30));
	
		//给泛型属性赋值
		tool.setO("Anne Hathaway");
		//获得泛型属性的值
		System.out.println(tool.getO());
		
		
	}
}

/**
 *1.<>号里的名字没有要求，任何一个字母都行，建议使用大写字母
 *2.<>号的类型可以有多个，用逗号隔开
 *	class Tool<T,A,B,C>
 * 
 * @author YQF
 *
 */
//声明一个泛型类
class Tool<T>{
	
	private T o;	//将T看成一个“占位”
	
	
	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}

	//声明泛型方法
	//无返回值，参数为泛型
	public void print(T t) {
		System.out.println(t);
	}
	
	//声明泛型方法
	//有返回值，无参数
	public T get(int index) {
		
		return null;
	}
}
