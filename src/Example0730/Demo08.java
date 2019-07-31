package Example0730;

import java.io.FileWriter;
import java.io.IOException;

public class Demo08 {
	public static void main(String[] args) throws IOException {
		/*
		 * FileWrite
		 * 案例：使用FileWriter往一个文件a.txt写内容
		 */
		//1.创建FileWriter对象
		FileWriter filewriter=new FileWriter("C:/Users/YQF/Desktop/a/a.txt",true);
		filewriter.write("你好");
		filewriter.close();
	}
}
