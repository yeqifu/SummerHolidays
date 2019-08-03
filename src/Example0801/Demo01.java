package Example0801;

public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 使用字符流的场景
		 * 1.使用FileReader读取字符
		 * 		原理：先读字节，再把字节转成字符(byte->char)
		 * 2.使用FileWriter写入字符
		 * 		原理：writer(String str),str转成 字符数组  再转成  字节写入文件
		 * 				(String->char[]->char->byte)
		 * 如果是读取文本文件，使用FileReader比较好，不考虑乱码的问题
		 * 如果是写入文本文件，不建议使用FileWriter,直接使用FileOutputStream好一点
		 * 
		 */
	}
}
