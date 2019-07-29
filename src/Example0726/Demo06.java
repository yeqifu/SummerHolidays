package Example0726;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo06 {
	public static void main(String[] args) {
		/*
		 * public long lastModified():获取文件最后修改的时间(时间是从1970年至文件修改时刻的毫秒数)
		 */
		File file=new File("C:\\Users\\YQF\\Desktop\\a\\b");
		long time=file.lastModified();
		System.out.println("文件最后修改的时间为:"+time);
		
		//将毫秒转换成秒
		Date date=new Date(time);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
}
