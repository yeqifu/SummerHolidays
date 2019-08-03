package Example0801;

import java.io.File;

public class Demo09 {
	public static void main(String[] args) {
		/*
		 * 	递归文件目录
		 */
		//1.创建目录对象
		File file=new File("C:\\Users\\YQF\\Desktop\\a");
		//2.调用printfSubFile方法
		long l=printfSubFile(file);
		System.out.println("a文件夹下的大小为："+l);
	}
	public static long printfSubFile(File file) {
		File[] subfiles=file.listFiles();
		long l=0;
		for(File f:subfiles) {
			if(f.isDirectory()) {
				printfSubFile(f);
			}else {
				
				System.out.println(f.getAbsolutePath());
				l=l+f.length();		//计算文件的大小
				
			}
		}
		return l;
	}
}

