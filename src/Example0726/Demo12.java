package Example0726;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo12 {
	public static void main(String[] args) throws IOException {
		/*
		 * 拷贝图片
		 */
		
		//创建输入流和输出流对象
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a\\斯嘉丽2.jpg");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a\\b\\斯嘉丽3.jpg");

		
		
		//1.通过输入流读取图片的数据
		int b=0;
		while((b=fis.read())!=-1) {
			//2.通过输出流写入图片的数据
			fos.write(b);
		}
		fis.close();
		fos.close();
		System.out.println("图片拷贝成功");
	}
}
