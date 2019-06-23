package Example0621;

public class Demo04 {
	public static void main(String[] args) {
		//使用循环输出4行5列的*
		/*
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.printf("*");
//			}
//			System.out.println("\n");
//		}
		//循环输出直角三角形
		//*
		//**
		//***
		//****
		//*****
		//******
		int row=6;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
