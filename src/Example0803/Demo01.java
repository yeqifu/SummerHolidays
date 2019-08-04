package Example0803;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	ByteArrayOutputStream 字节数组输出流
		 */
		
		//1.文件输入流
		FileInputStream fis=new FileInputStream("C:\\Users\\YQF\\Desktop\\a/a.txt");
		//2.字节数组输出流
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		//3.字节数组
		byte[] arr=new byte[5];
		int len;
		while((len=fis.read(arr))!=-1) {
			//通过字节缓冲数组写入
			baos.write(arr,0,len);
			
			//会乱码
			//System.out.println(new String(arr, 0, len));
			
		}
		//内部会调用toString方法
		System.out.println(baos);
		fis.close();
	}
}
