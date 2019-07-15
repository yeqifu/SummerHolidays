package Example0714;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
	public static void main(String[] args) throws ParseException {
		//SimpleDateFormat的public Date parse(String source)
		String str="2018年02月02日 10:24:21";
		
		//将字符串转换成Date类型
		//1.创建DateFormat对象
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		//2.把字符串解析成Date对象
		Date date=sdf.parse(str);
		System.out.println(date);
		
		//获取日期的毫秒数
		System.out.println(date.getTime());
	}
}
