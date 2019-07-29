package Example0726;

import java.io.File;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * File类中常见的方法
		 * 		public boolean isFile():判断是否是文件
		 * 		public boolean isDirectory():判断是否是文件夹
		 */
		File file=new File("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		File file2=new File("C:\\Users\\YQF\\Desktop\\a\\b");
		
		boolean b=file.isFile();
		System.out.println("C:\\Users\\YQF\\Desktop\\a\\a.txt   是否是文件:"+b);
		boolean b2=file.isDirectory();
		System.out.println("C:\\Users\\YQF\\Desktop\\a\\a.txt   是否是文件夹:"+b2);
		
		boolean b3=file2.isFile();
		System.out.println("C:\\Users\\YQF\\Desktop\\a\\b    是否是文件:"+b3);
		boolean b4=file2.isDirectory();
		System.out.println("C:\\Users\\YQF\\Desktop\\a\\b      是否是文件夹:"+b4);
		
		
	}
}
