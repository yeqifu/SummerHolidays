package Example0726;

import java.io.File;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.File类的创建功能
		 * 		public boolean createNewFile():创建文件  如果存在这样的文件，就不创建
		 * 		public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
		 * 		public boolean mkdirs():创建文件夹 如果父文件夹不存在，会帮你创建出来
		 * 注意事项:如果你创建文件或者文件夹忘了写盘符路径，那么默认在项目路径下
		 * 
		 * 2.列出目录中的文件
		 */
		
/*		//1.File类的创建功能
		//1.1创建文件
		File file1=new File("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		boolean b1=file1.createNewFile();
		System.out.println("创建文件是否成功:"+b1);
		
		//1.2创建文件夹
		File file2=new File("C:/Users/YQF/Desktop/a/b");
		boolean b2=file2.mkdir();
		System.out.println("创建文件夹是否成功:"+b2);
		
		//1.3创建多层文件夹
		File file3=new File("C:/Users/YQF/Desktop/a/d/d/d");
		boolean b3=file3.mkdirs();
		System.out.println("创建多层文件夹是否成功:"+b3);*/
		
		
		
		//2.列出目录中的文件
		File file=new File("D:\\Document");
		String[] files=file.list();
		System.out.println("D:\\Document底下的内容为:");
		for(String content:files) {
			System.out.println(content);
		}
		
		System.out.println("===========================");
		File[] fs=file.listFiles();//内部把文件路径封装成文件对象
		for(File f:fs) {
			System.out.println(f.getAbsolutePath());
		}
	}
}
