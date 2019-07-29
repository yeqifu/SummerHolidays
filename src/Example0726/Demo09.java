package Example0726;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo09 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileInputStream
		 * 构造方法
		 * 1.FileInputStream(File file)
		 * 2.FileInputStream(String name)
		 * 成员方法
		 * int read() 从此输入流中读取一个数据字节
		 */
		
		//FileInputStream(File file)
		//1.创建一个file对象
		File file=new File("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		//2.创建一个文件输入流对象
		FileInputStream fis=new FileInputStream(file);
		
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
		
		//FileInputStream(String name)
		FileInputStream fis2=new FileInputStream("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		System.out.println(fis2.read());
		System.out.println(fis2.read());
		System.out.println(fis2.read());
		fis2.close();
	}
}
