package Example0801;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo12 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	SequenceInputStream 
		 */
		
		//1.Vector是集合
		Vector<InputStream> vector=new Vector<InputStream>();
		vector.add(new FileInputStream("C:\\Users\\YQF\\Desktop\\a/a.txt"));
		vector.add(new FileInputStream("C:\\Users\\YQF\\Desktop\\a/b.txt"));
		vector.add(new FileInputStream("C:\\Users\\YQF\\Desktop\\a/c.txt"));
		//2.Enumeration枚举
		Enumeration<InputStream> e=vector.elements();
		//3.序列流
		SequenceInputStream sis=new SequenceInputStream(e);
		//4.创建输出流
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/d.txt");
		//5.读写
		int b=0;
		while((b=sis.read())!=-1) {
			fos.write(b);
		}
		//6.关闭流
		sis.close();
		fos.close();
	}
}
