package Example0717;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.如果集合添加基本数据类型，内部会提升为包装类型
 * int->Integer
 * double->Double
 * 
 * 2.List list=new ArrayList();这样声明一个集合对象，默认是可以添加任何类型的元素
 * 
 * 3.如果在声明集合时，不添加泛型，就会有安全隐患（类型转换异常）
 * @author YQF
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		//集合泛型：
		/**
		 * 泛型：
		 * 1.泛型的作用：把类型明确的工作推前到创建对象或者调用方法的时候
		 * 2.泛型是一种参数化类型，把类型当作参数一样传递来明确集合的元素类型
		 * 
		 * 泛型的好处：
		 * 1.提高安全性（将运行期的错误转换到编译期）
		 * 2.省去强转的麻烦
		 * 
		 * 泛型基本使用
		 * 声明集合泛型的格式List<Student> list=new ArrayList<Student>();
		 * <>中放的必须是引用数据类型
		 */
		
		//声明一个泛型集合
		List<String> list=new ArrayList<>();
		list.add("Scarlett Johansson");
		list.add("Elizabeth Olsen");
		list.add("Anne Hathaway");
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println("list:"+s);
		}
	}
}
