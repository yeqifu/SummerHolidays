package Example0714;

import java.util.Calendar;

public class Demo06 {
	public static void main(String[] args) {
		//如何获取任意年份是平年还是闰年
		int year=2004;
		
		//获取一个日历对象
		Calendar calendar=Calendar.getInstance();
		
		//设置日历为....年3月1号
		calendar.set(year, 2,1);
		
		//在日期的字段减1
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		
		//求2月有几天
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		if(day==29) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"是平年");
		}
	}
}
