package Example0801;

import java.io.File;
import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		/*
		 * 	练习:从键盘输入接收一个文件夹路径，打印出该文件夹下所有的.jpg文件名
		 */
		//1.获取文件路径
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个文件夹路径");
		String path=scanner.nextLine();
		
		File file=new File(path);
		if(!file.exists()) {
			System.out.println("此路径对应的文件不存在");
			return;
		}
		if(!file.isDirectory()) {
			System.out.println("请输入文件夹路径，而不是文件路径");
			return;
		}
		
		printPicture(file);
	}
	public static void printPicture(File file) {
		File[] subfiles=file.listFiles();
		long l=0;
		for(File f:subfiles) {
			if(f.isDirectory()) {
				printPicture(f);
			}else {
				String name=f.toString();
				//	g.getName();
				if(name.endsWith(".jpg")) {
					System.out.println(f);
				}
				
			}
		}
	}
}
