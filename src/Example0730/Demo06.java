package Example0730;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) throws IOException {
		/*
		 * 练习：根据用户输入的文件【图片】拷贝到当前项目目录
		 */
		//1.获得用户输入的文件路径
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个文件路径，不要输入文件夹路径:");
		String path=scanner.nextLine();
		//2.判断是否是文件路径，还是文件夹路径
		File file=new File(path);
		if(!file.isFile()) {
			System.out.println("您输入的是文件夹路径，请输入文件路径");
		}else {
			//3.声明输入输出流对象
			FileInputStream fis=new FileInputStream(path);
			FileOutputStream fos=new FileOutputStream(file.getName());
			
			//4.拷贝
			byte[] buf=new byte[8*1024];
			int b=0;
			while((b=fis.read(buf))!=-1) {
				fos.write(buf,0,b);
			}
			//5.关闭流
			fis.close();
			fos.close();
			System.out.println("拷贝完成");
		}
	}
}
