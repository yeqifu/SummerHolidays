package Example0730;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferInputStream和BufferOutputStream
		 */
		//1.声明一个字符输入流和一个字符输出流
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽2.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/d/斯嘉丽.jpg");
		
		//2.声明一个字符缓冲输入流和一个字符缓冲输出流
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		//3.输入流读数据，输出流写数据
		int b=0;
		//bis.read()方法  一次读8KB的数据
		while((b=bis.read())!=-1) {
			bos.write(b);//内部会写8KB的数据
		}
		
		//4.关闭流，只需关闭缓冲流，文件流不用关
		bis.close();//内部会关闭文件输入流
		bos.close();//内部会关闭文件输出流
		System.out.println("拷贝完毕！");
		
	}
}
