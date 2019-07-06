package Example0705;

/**
 * String 字符串这个类重写了object的equals方法
 * 重写后的比较规则，两个字符串的每一个字符是否一样，有一个字符不一样，就返回false;
 * @author YQF
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		String s1="guming";
		String s2="guming";
		System.out.println("s1:"+s1.hashCode());
		System.out.println("s2:"+s2.hashCode());
		
		System.out.println(s1.equals(s2));
	}
}
