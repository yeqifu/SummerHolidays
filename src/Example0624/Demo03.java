package Example0624;

public class Demo03 {
	public static void main(String[] args) {
		//A水池有154吨水，B水池有82吨水，两水池每小时都排出2吨水
		//对少个小时后，A水池的吨数是B水池的4倍。
		int a=154;
		int b=82;
		for(int i=1;i<=77;i++) {
			a=a-2;
			b=b-2;
			if(a==(4*b)) {
				System.out.println(i+"小时后，A水池的吨数是B水池的4倍");
				
			}
		}
	}
}
