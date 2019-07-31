package Example0730;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo09 {
	public static void main(String[] args) throws IOException {
		/*
		 * 案例：字符流的拷贝
		 * 
		 */
		//1.声明字符输入和输出流
		FileReader filereader=new FileReader("C:\\Users\\YQF\\Desktop\\a/a.txt");
		FileWriter filewriter=new FileWriter("C:\\Users\\YQF\\Desktop\\a\\b/hello.txt",true);
		
		char[] chars=new char[1024*1];
		
		//2.读取和写入内容
		
		int b=-1;
		while((b=filereader.read(chars))!=-1) {
			filewriter.write(chars, 0, b);
		}
		filereader.close();
		filewriter.close();
	}
}
