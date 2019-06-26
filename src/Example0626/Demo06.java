package Example0626;

public class Demo06 {
	public static void main(String[] args) {
		Son son=new Son();
		System.out.println(son.num);
		Father2 son2=new Son();
		System.out.println(son2.num);
	}
}
class Father2{
	int num=20;
}
class Son extends Father2{
	int num=10;
}
