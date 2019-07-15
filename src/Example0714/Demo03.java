package Example0714;

import java.util.Date;
import java.util.StringTokenizer;

public class Demo03 {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		//
		String s="you are welcome(thank you),nice to meet you";
		StringTokenizer fenxi=new StringTokenizer(s, "(),");
		int number =fenxi.countTokens();
		while(fenxi.hasMoreTokens()) {
			String str=fenxi.nextToken();
			System.out.println(str+"");
		}
		System.out.println("共有单词："+number+"个");
	}
}
