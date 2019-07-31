package Example0730;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo05 {
	public static void main(String[] args) throws IOException {
		/*
		 *  案例:图片加密
		 *  
		 */
		//1.声明输入输出流对象
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽10.jpg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽10-解密.jpg");
		
		int b=0;
		while((b=fis.read())!=-1) {
			fos.write(b^5);
		}
		
		fis.close();
		fos.close();
		System.out.println("图片解密完成");
	}
}
