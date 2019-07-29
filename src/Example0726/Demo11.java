package Example0726;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo11 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream:表示文件输出流，用于往文件中写内容
		 * 
		 * 构造方法
		 * FileOutputStream(String name)
		 * FileOutputStream(File file)
		 * 
		 * 方法
		 * write(int b)  //每次写一个字节
		 * write(byte[] b)  //一次写多个字节
		 */
		//1.创建文件输出流对象
		//FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		OutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		//2.写数据
		//fos.write(98);
		byte[] b= {100,101,102};
		fos.write(b);
		//3.关闭流
		fos.close();
	}
}
