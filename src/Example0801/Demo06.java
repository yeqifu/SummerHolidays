package Example0801;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * 	装饰设计模式
		 */
		Ystudent ys=new Ystudent(new Ustudent());
		ys.code();
	}
}	
interface Person{
	public abstract void code();
}
final class Ustudent implements Person{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("我会C语言....");
	}
	
}
class Ystudent implements Person{
	private Ustudent us;
	public Ystudent(Ustudent us) {
		// TODO Auto-generated constructor stub
		this.us=us;
	}
	
	@Override
	public void code() {
		// TODO Auto-generated method stub
		us.code();
		System.out.println("我会java...");
	}
	
}