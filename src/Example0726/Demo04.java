package Example0726;

import java.io.File;

public class Demo04 {
	public static void main(String[] args) {
		/*
		 * File的删除文件功能
		 * public boolean delete():删除文件或者文件夹
		 * 
		 * 删除注意事项：
		 * 1.java中的删除不走回收站
		 * 2.要删除一个文件夹，该文件夹内不能包含文件或者文件夹
		 */
		
		//1.删除文件
		File file=new File("C:\\Users\\YQF\\Desktop\\a\\Hello.txt");
		boolean b=file.delete();
		System.out.println("删除文件是否成功:"+b);
		
		//2.删除文件夹
		File file2=new File("C:\\Users\\YQF\\Desktop\\a\\d\\d\\d");
		boolean b2=file2.delete();
		System.out.println("删除文件夹是否成功:"+b2);
	
	}
}	
