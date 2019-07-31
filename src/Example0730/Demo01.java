package Example0730;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 案例：拷贝图片【优化一、这种方式在大文件下不建议使用】
		 * 前面拷贝的图片问题：每次只读一个字节，写入的时候也是一个一个字节写
		 * 
		 * 字节数组拷贝之available()方法
		 */
		//1.文件输入流
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽2.jpg");
		int size=fis.available();  //返回文件的长度[字节为单位]
		System.out.println("文件的大小:"+size);
		
		//2.现在一次性读文件大小的字节
		//2.1定义一个字节数组
		byte[] bytes=new byte[size];
		
		//2.2把数据读到字节数组中
		int r=fis.read(bytes);//返回的值是实际读到的图片的大小
		System.out.println(r);
		
		//3.声明一个输出流对象
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽4.jpg");
		fos.write(bytes);
		System.out.println("写入成功");
		fis.close();
		fos.close();
	}
}
