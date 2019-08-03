package Example0801;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) throws IOException {
		/*
		 * 	练习：获取文本上字符出现的次数，并将其写文件中
		 */
		//1.声明
		FileReader fr=new FileReader("C:\\Users\\YQF\\Desktop\\a/a.txt");
		//2.声明一个Map集合
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		//3.遍历a.txt
		int b=-1;
		while((b=fr.read())!=-1) {
			//4.进行判断，如果是第一次，则加入到map中，第二次则Integer加一
			//System.out.println(b);
			char c=(char)b;
			if(map.get(c)==null) {
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
			}
		}
		fr.close();
		System.out.println(map);
		//4.声明
		FileWriter fw=new FileWriter("C:\\Users\\YQF\\Desktop\\a/b.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		Set<Entry<Character, Integer>> entrys=map.entrySet();
		for(Entry<Character, Integer> entry:entrys) {
			switch (entry.getKey()) {
			case ' ':
				bw.write("空格="+entry.getValue());
				break;
			case '\r':
				bw.write("回车="+entry.getValue());
				break;
			case '\n':
				bw.write("换行="+entry.getValue());
				break;
			case '\t':
				bw.write("tab键="+entry.getValue());
				break;
			default:
				bw.write(entry.getKey()+"="+entry.getValue());
				break;
			}
			
			bw.newLine();
		}
		bw.close();
	}
}
