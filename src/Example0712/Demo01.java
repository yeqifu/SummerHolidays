package Example0712;

public class Demo01 {
	public static void main(String[] args) {
		//StringBuffer的添加方法
		StringBuffer s=new StringBuffer();
		StringBuffer s2=s.append("Hello");
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		s2.insert(1, 'g');
		System.out.println(s);
		System.out.println(s2);
	}
}
