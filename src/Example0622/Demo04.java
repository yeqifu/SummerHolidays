package Example0622;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		System.out.println("请输入九九乘法表的行数");
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		System.out.println("请输入九九乘法表的列数");
		int column=scanner.nextInt();
		multiplicationTable(row,column);
	}
	public static void multiplicationTable(int row,int column) {
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println("");
		}
	}
}
