package Example0803;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	Properties的概述和作为Map集合的使用
		 * 	Properties:属性
		 * 		1.Properties 类表示一个持久的属性集
		 * 		2.Properties可保存在流中或从流中加载
		 * 		3.属性列表中每个键及其对应值都是一个字符串
		 */
		//存储数据
		//test1();
		
		//读取数据
		//test2();
	
		//1.创建属性对象
		Properties p=new Properties();
		//2.关联文件
		p.load(new FileInputStream("info.properties"));
		//3.遍历一
		Set<Object> keys=p.keySet();
		for(Object key:keys) {
			System.out.println(key+"="+p.get(key));
		}
		//4.遍历二
		Set<Entry<Object, Object>> entrys=p.entrySet();
		for(Entry<Object, Object> entry:entrys ) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}

	private static void test2() throws IOException, FileNotFoundException {
		//使用Properties读取数据
		//1.创建属性对象
		Properties p=new Properties();
		//2.关联文件
		p.load(new FileInputStream("info.properties"));
		//3.通过key读数据
		String name=p.getProperty("name");
		String age=p.getProperty("age");
		String hometown=p.getProperty("hometown");
		System.out.println(name);
		System.out.println(age);
		System.out.println(hometown);
	}

	private static void test1() throws IOException, FileNotFoundException {
		//1.创建属性对象
		Properties p=new Properties();
		//2.存储数据
		p.setProperty("name", "Scarlett Johansson");
		p.setProperty("age", "30");
		p.setProperty("hometown", "American");
		//3.关联文件
		p.store(new FileOutputStream("info.properties"), null);
	}
}	
