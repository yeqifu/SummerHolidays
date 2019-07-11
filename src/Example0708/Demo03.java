package Example0708;

public class Demo03 {
	public static void main(String[] args) {
		//把一个字符串的首字母转换成大写，其余为小写
		String s="hELLO,How Are You";
		//截取第一个字母
		String s1=s.substring(0, 1);
		//截取后面的字符串
		String s2=s.substring(1);
		s1=s1.toUpperCase();
		s2=s2.toLowerCase();
		s=s1.concat(s2);
		System.out.println(s);
		
	}
}
