package Example0623;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		int arr[]= {12,2,56,789,88};
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你想查看的数：");
		int a=scanner.nextInt();
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(a==arr[i]) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("您输入的数不在此数组中");
		}else {
			System.out.println("您输入的数在此数组中的位置为："+index);
		}
		
	}
}
