package Example0726;

import java.io.File;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 案例:输出指定目录下指定后缀的文件名
		 * 需求:判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
		 */
	
//		test1();
		
		//1.创建一个file对象
		File file=new File("D:\\Picture\\android");
		//2.返回目录下的所有字文件
		File[] filenames=file.listFiles();
		//3.遍历
		System.out.println("后缀名为.jpg的有:");
		for(File filename:filenames) {
			if(filename.getName().endsWith(".jpg")) {
				System.out.println(filename);
			}
		}
	}

	private static void test1() {
		//1.创建一个file对象
		File file=new File("D:\\Picture\\android");
		//2.返回目录下的所有字文件
		String[] filenames=file.list();
		System.out.println("后缀名称是.jpg的有:");
		//3.遍历
		for(String filename:filenames) {
			if(filename.endsWith(".jpg")) {
				System.out.println(filename);
			}
		}
	}
}
