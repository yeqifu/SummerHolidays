package Example0629;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work w1=new Work("10", "后厨帮忙");
		Work w2=new Work("5", "前台收银");
		
		Work w3=w1;
		System.out.println("w1的hashCode"+w1.hashCode());
		System.out.println("w1的hashCode"+w2.hashCode());
		System.out.println("w1的hashCode"+w3.hashCode());
	}

}
