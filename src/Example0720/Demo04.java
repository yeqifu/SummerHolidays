package Example0720;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo04 {
	public static void main(String[] args) {
		//产生10个1-20之间的随机数，要求不能重复
		//1.生成一个set对象
		Set<Integer> set=new HashSet<>();
		
		//2.创建随机数对象
		Random rs=new Random();
		
		//3.生成十个随机数
		for(int i=0;i<10;i++) {
			
		}
		
		while(true) {		//while(set.size()!=10)  
			int num=rs.nextInt(21);
			if(num!=0) {
				set.add(num);
			}
			if(set.size()==10) {
				break;
			}
		}
		System.out.println(set);
	}
}
