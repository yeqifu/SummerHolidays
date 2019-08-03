package Example0801;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Demo11 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	SequenceInputStream 序列流
		 * 	序列流可以把多个字节输入流整合成一个，从序列流中读取数据时
		 * 	将从被整合的第一个流开始读，读完一个之后继续读第二个，以此类推
		 */
		//1.创建字节输入输出流
		FileInputStream file1=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/a.txt");
		FileInputStream file2=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/b.txt");
		//2.创建序列流
		SequenceInputStream sis=new SequenceInputStream(file1, file2);
		//3.创建输出流
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/c.txt");
		//4.读写
		int b=0;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		//5.关闭流
		file1.close();
		file2.close();
		sis.close();
		fos.close();
		
	}
}
