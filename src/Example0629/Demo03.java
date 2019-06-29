package Example0629;

public class Demo03 {
	public static void main(String[] args) {
		Cry hello=new Cry() {
			public void cry() {
				System.out.println("大家好，祝工作顺利！");
			}
		};
		hello.cry();
	}
}
class Cry{
	public void cry() {
		System.out.println("大家好！");
	}
}