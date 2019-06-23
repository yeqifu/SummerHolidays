package Example0621;

public class Demo05 {
	public static void main(String[] args) {
		//输出九九乘法表
		int row=9;
		int column=9;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
					int a=i*j;
					System.out.print(j+"*"+i+"="+a+"	");//或者"\t"
					
				
				
			}
			System.out.println("\n");
		}
	}
}
