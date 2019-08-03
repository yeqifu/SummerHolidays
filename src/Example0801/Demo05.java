package Example0801;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	案例：将文本反转写入另一个文件
		 * 	思想：for循环的倒序遍历
		 */
		
		//1.把文本每一行内容读取出来存储在List<String>集合中
		
		FileReader fr=new FileReader("C:\\Users\\YQF\\Desktop\\a/a.txt");
		BufferedReader br=new BufferedReader(fr);
		List<String> list=new ArrayList<String>();
		String line=null;
		
		while((line=br.readLine())!=null) {
			list.add(line);
		}
		/*for(String con:list) {
			System.out.println(con);
		}*/
		//2.当我们写入文件时，倒序保存List集合中的内容到文件中
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\YQF\\Desktop\\a/a.txt"));
		for(int i=list.size()-1;i>=0;i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		//3.关闭流
		br.close();
		bw.close();
		System.out.println("完成");
	}
}
