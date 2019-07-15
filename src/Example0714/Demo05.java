package Example0714;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05 {
	public static void main(String[] args) throws ParseException {
		//计算自己来到这个世界多少天
		String s="1999-5-14";//自己的出生年月日
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(s);
		System.out.println(date);
		long selfDate=date.getTime();//得到自己的毫秒数
		System.out.println(selfDate);
		Date d=new Date();
		System.out.println(d.getTime());//获得系统当前的毫秒数
		System.out.println((d.getTime()-selfDate)/1000/60/60/24);
	}
}
