package Example0708;

public class Demo01 {
	public static void main(String[] args) {
		String password="adaEFDX5628!2~!4?";
		int number=0;//数字
		int big=0;//大写字母
		int small=0;//小写字母
		int other=0;//其它符号
		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);
			if(ch>='0'&&ch<='9') {
				number++;
			}else if(ch>='A'&&ch<='Z'){
				big++;
			}else if(ch>='a'&&ch<='z'){
				small++;
			}else {
				other++;
			}
		}
		System.out.println("数字出现的次数为："+number);
		System.out.println("大写字母出现的次数为："+big);
		System.out.println("小写字母出现的次数为："+small);
		System.out.println("其它符号出现的次数为："+other);
		
	}
}
