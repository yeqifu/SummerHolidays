package Example0801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/*
		 *	带缓冲的字符流 BufferedReader和BufferedWriter
		 *	1.这两个类，内部都有一个缓冲区，字符数组
		 *	2.bufferedReader.read()方法，内部会读8*1024个字符
		 *	3.bufferedWriter.writer()方法，内部会写8*1024个字符
		 *
		 *	带缓冲的字节流，BufferedInputStream/BufferedOutputStream
		 *	2.这两个类，内部都有一个缓冲区，字节数组
		 * 
		 */
		//需求：拷贝文件  C:\Users\YQF\Desktop\a\a.txt  -> C:\Users\YQF\Desktop\a\b\Hello.txt
		
		//1.声明带缓冲的字符输入输出流对象
		FileReader fr=new FileReader("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		FileWriter fw=new FileWriter("C:\\Users\\YQF\\Desktop\\a\\b\\Hello.txt",true);
		BufferedReader bufferedReader=new BufferedReader(fr);
		BufferedWriter bufferedWriter=new BufferedWriter(fw);
		
		//2.读写
		int c=0;
		while((c=bufferedReader.read())!=-1) {
			bufferedWriter.write(c);
		}
		//3.关闭流
		bufferedReader.close();
		bufferedWriter.close();
		System.out.println("拷贝成功");
	}
}
