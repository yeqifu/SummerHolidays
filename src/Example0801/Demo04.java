package Example0801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter的newLine()方法
		 */
		//1.创建一个FileReader对象
		FileReader fr=new FileReader("C:\\Users\\YQF\\Desktop\\a/a.txt");
		//2.创建一个BufferReader对象
		BufferedReader br=new BufferedReader(fr);
		
		//3.创建一个FileWriter对象
		FileWriter fw=new FileWriter("C:\\Users\\YQF\\Desktop\\a\\d/Hello.txt");
		//4.创建一个BufferWriter对象
		BufferedWriter bw=new BufferedWriter(fw);
		
		String line=null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();	//读一行，换一行
		}
		br.close();
		bw.close();
		System.out.println("拷贝成功");
	}
}
