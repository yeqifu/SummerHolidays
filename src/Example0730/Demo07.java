package Example0730;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) throws IOException {
		/*
		 * 案例：录入数据拷贝到文件
		 * 根据用户在键盘中输入的内容，然后写入到一个文件中去
		 */
		
		//1.声明一个Scanner对象
		Scanner scanner=new Scanner(System.in);
		//2.提示用户输入
		System.out.println("请输入内容，最和请输入quit结束内容的输入");
		//3.声明一个文件输出流对象
		FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/a.txt",true);
		while(true) {
			String s=scanner.nextLine();
			if(s.equals("quit")) {
				break;
			}
			fos.write(s.getBytes());
			fos.write("\r\n".getBytes());
		}
		//4.关闭流
		System.out.println("录入成功!");
	}
}
