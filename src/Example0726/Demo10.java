package Example0726;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo10 {
	public static void main(String[] args) throws IOException {
		/*
		 * 案例：读取txt文件
		 */
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a\\a.txt");
		int f=0;
		while((f=fis.read())!=-1) {
			System.out.println((char)f);
		}
		fis.close();
	}
}
