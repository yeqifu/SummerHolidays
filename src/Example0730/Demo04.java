package Example0730;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
	public static void main(String[] args) throws Exception {
		/*
		 *	流的标准处理异常代码1.7版本
		 * 1.把流对象的声明放在try()括号里面
		 * 2.操作流[读写数据]的代码放在花括号里面
		 * 3.这样不用关闭流,java会自动关闭流
		 * 4.在try的括号里的对象,必须是实现AutoCloseable的接口
		 */
		try(
			FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/斯嘉丽2.jpg");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\YQF\\Desktop\\a/d/d/斯嘉丽.jpg");
			MyInputStream my=new MyInputStream();	
		){
			int b=0;
			while((b=fis.read())!=-1) {
				fos.write(b);
			}
			System.out.println("拷贝成功");
		}
	}
}
class MyInputStream implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("输入流自动关闭");
	}
	
}