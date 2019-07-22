package Example0721;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet的排序方式有2种
 * 1.自然顺序(Comparable)
 * 2.比较器顺序(Comparator)
 * 	 public TreeSet(Comparator<? super E> comparator)
 *   如果元素的类型是final类型，不能被重写，这个时候选择Comparator排序方式
 * 3.如果希望有相同的元素存在，在compareTo或者compare方法，返回1就行了
 */
public class Demo01 {
	//TreeSet:可以用于排序
	//1.存Integer,或者String,这个两已经实现了comparable接口
	//2.如果是存自定义对象，比如Student,那这个学生要自己实现comparable接口
	public static void main(String[] args) {
		//Set<Integer> set=new TreeSet<Integer>();//无参的构造方法
		
		//一、数字由小到大
		//Set<Integer> set=new TreeSet<Integer>();//无参的构造方法
			
		//二、数字由大到小
		//public TreeSet(Comparator<? super E> comparator)
		Set<Integer> set=new TreeSet<>(new MyComparator());
		set.add(80);
		set.add(8);
		set.add(60);
		for(Integer num:set) {
			System.out.println(num);
		}
	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
//		System.out.println("o1:"+o1);
//		System.out.println("o2:"+o2);
		
		return o2-o1;  //数字由大到小
	}
	
}
