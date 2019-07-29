package Example0726;

import java.io.File;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * File的重命名功能
		 * 		public boolean renameTo(File dest):把文件重命名为指定的文件路径
		 * 
		 * 		dest:destination 目的，目标
		 * 重命名的注意事项
		 * 		如果路径名相同，就是改名
		 * 		如果路径名不同，就是改名并且剪切
		 */
		//需求:把C:\Users\YQF\Desktop\a.txt  文件名该成hello.txt
		//1.创建文件关联对象a.txt
		File file=new File("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		File dest=new File("C:\\Users\\YQF\\Desktop\\a\\b\\Hello.txt");
		//2.重命名
		boolean b=file.renameTo(dest);
		System.out.println("文件重命名是否成功:"+b);
	}
}
