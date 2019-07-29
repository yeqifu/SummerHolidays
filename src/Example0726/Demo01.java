package Example0726;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * File:表示一个文件或者路径
		 * 构造方法
		 * 1.File(String pathname)
		 * 		根据一个路径得到File对象
		 * 2.File(String parent,String child)
		 * 		根据一个目录和一个子文件/目录得到File对象
		 * 3.File(File parent,String child)
		 * 		根据一个父File对象和一个子文件/目录得到File对象
		 */
		
		//1.File(String pathname)
		//路径的第一种写法，使用斜杠，代表转义
		String path="C:\\Users\\YQF\\Desktop";//C:\Users\YQF\Desktop
		//路径的第二种写法，将每个斜杠改成反斜杠
		String path2="C:/Users/YQF/Desktop";
		
		File file1=new File(path);//文件对象已经关联了此文件
		System.out.println("file1:"+file1); //不是地址而是路径，表明重写了toString方法
		File file2=new File(path2);
		System.out.println("file2:"+file2);
		
		//2.File(String parent,String child)
		//File file3=new File("C:\\Users\\YQF", "\\Desktop/新建文本文档.txt");  也是正确的
		File file3=new File("C:\\Users\\YQF\\Desktop", "新建文本文档.txt");
		System.out.println(file3);
		long l=file3.length();
		System.out.println("file3文件的长度:"+l);
		
		//3.File(File parent,String child)
		File desktopFolder=new File("C:\\Users\\YQF\\Desktop");
		File file4=new File(desktopFolder,"新建文本文档.txt");
		System.out.println(file4);
		
	}
}
