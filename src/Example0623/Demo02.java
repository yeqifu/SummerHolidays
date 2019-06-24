package Example0623;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 打印倒直角三角形
		 *  *****
		 *   ****
		 *    ***
		 *     **
		 *      *
		 */
		daiyin(5,5);
		
	}
	public static void daiyin(int i,int j) {
		for(i=0;i<5;i++) {
			for(j=0;j<5-i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
			for(int k=0;k<=i;k++){
				System.out.print(" ");
			}
		}
	}
}
