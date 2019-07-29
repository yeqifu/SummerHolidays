package Example0726;

import java.io.File;
import java.io.FilenameFilter;

public class Demo08 {
	public static void main(String[] args) {
		/*
		 * 文件名称过滤器FilenameFilter
		 * 需求：指定一个文件夹(目录)，打印出这个文件夹所有jpg图片
		 * FilenameFilter-接口
		 * 作用：FilenameFilter:返回数组之前，先把不符合条件的元素去除
		 */
		//1.声明一个file对象
		File file=new File("D:\\Picture\\android");
		//2.FilenameFilter:文件名称过滤器
		String[] subFileNames=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".jpg")||name.endsWith(".png");
			}
		});
		
		System.out.println("过滤后的结果为:");
		for(String subFileName:subFileNames) {
			System.out.println(subFileName);
		}
		
	}
}
