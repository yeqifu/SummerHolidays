package Example0622;

import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		System.out.println("请输入三角形的行数：");
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		System.out.println("请输入三角形的列数：");
		int column=scanner.nextInt();
		triangle(row,column);
	}
	public static void triangle(int row,int column) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
