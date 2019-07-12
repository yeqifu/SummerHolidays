package Example0711;

public class Demo01 {
	public static void main(String[] args) {
		//public String replace(char oldChar,char newChar)//替换字符
		String s1="Hello";
		s1=s1.replace('l', 'i');
		System.out.println(s1);
		
		//public String replace(CharSequence target,CharSequence replacement)
		//CharSequence 接口，字符序列
		String s2="I love you";
		s2=s2.replace("love", "hate");
		System.out.println(s2);
	}
}
