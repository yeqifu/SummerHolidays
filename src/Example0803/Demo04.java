package Example0803;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo04 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	打印流的概述和特点
		 * 	1.该流可以很方便的将对象的toString()结果输出，并且自动加上换行，而且可以使用自动刷出的模式
		 * 	2.System.out就是一个PrintStream,其默认向控制台输出信息
		 * 	3.PrintStream和PrintWriter分别是打印的字节流和字符流
		 */
		
		//1.打印的字节流【打印到控制台】
		PrintStream ps=System.out;
		ps.println("Hello word");
		ps.print("Scarlett Johansson");
		
		//2.打印的字符流
		/*
		 * 	1.PrintWriter调用打印方法，是将内容写入到文件中
		 * 	2.如果打印了内容，要关闭流，不然内容无法写入到文件中
		 */
		PrintWriter pw=new PrintWriter("C:\\Users\\YQF\\Desktop\\a/g.txt");
		pw.print("斯嘉丽");
		pw.print(30);
		pw.close();
	}
}
