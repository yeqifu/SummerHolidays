package Example0716;

public class Demo01 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("陶喆");
		System.out.println("sb:"+sb);
		test2(sb);
		System.out.println("sb:"+sb);
	}
	public static void test2(StringBuffer sb) {
		sb=new StringBuffer("成名曲 爱很简单");
	}
}

