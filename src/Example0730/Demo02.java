package Example0730;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/*
		 * 案例：拷贝图片【优化二、这种方式开发中建议经常使用】
		 * 
		 * 1.每次只读一个字节，觉得太慢
		 * 2.一次性读一个文件的所有数据，又怕内存装不下
		 * 	 内存只有2G,视频有3G,内存会溢出
		 * 解决方法:折中，定义每次读8KB
		 */
		//定义一个8KB的字节数组
		byte[] bytes=new byte[1024*8];
		
		//1.定义输入和输出流对象
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽2.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽5.jpg");
		
		int len=0;
		int i=0;
		while((len=fis.read(bytes))!=-1) {
			//写入文件
			i++;
			fos.write(bytes,0,len);
		}
		System.out.println("读取的次数"+i);
		
	}
}
