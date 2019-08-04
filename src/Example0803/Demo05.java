package Example0803;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	随机流RandomAccessFile
		 */
		//1.创建一个随机流对象
		RandomAccessFile raf=new RandomAccessFile("C:\\Users\\YQF\\Desktop\\a/g.txt", "rw");
		//2.声明一个字节数组
		int b=0;
		byte[] by=new byte[1024];
		//3.读数据
		while((b=raf.read(by))!=-1) {
			System.out.println(new String(by,0,b));
		}
		//4.写数据
		raf.seek(6);
		raf.writeChars("abc");
	}
}
