package Example0801;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader的readLine()方法
		 */
		
		//1.创建一个FileReader对象
		FileReader fr=new FileReader("C:\\Users\\YQF\\Desktop\\a/a.txt");
		//2.创建一个BufferedReader对象
		BufferedReader br=new BufferedReader(fr);
		//System.out.println(br.readLine());
		
		String line=null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		
		
	}
}
