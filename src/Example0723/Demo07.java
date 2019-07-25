package Example0723;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) {
		//模拟斗地主
		/*
		 * 功能：
		 * 1.准备一副牌(54张)
		 * 2.洗牌(打乱牌的顺序)
		 * 3.留三张底牌
		 * 4.发牌(三个人)
		 * 5.每个人拿到牌后，对牌进行排序
		 * 6.出牌...
		 */
		
		//1.准备一副牌(54张)
		List<String> poker=new ArrayList<String>();
		//花色
		String[] colors= {"黑桃","红心","梅花","方块"};
		//牌的数字
		String[] nums= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for(String color:colors) {
			for(String num:nums) {
				String s=color+num;
				poker.add(s);
			}
		}
		//大王和小王
		poker.add("大王");
		poker.add("小王");
		System.out.println(poker);
		
		//2.洗牌
		Collections.shuffle(poker);
		
		//3.留三张底牌
		List<String> dipai=new ArrayList<String>();
		Random random=new Random();
		for(int i=0;i<3;i++) {
			//0~53;
			//0~52;
			//0~51;
			int index=random.nextInt(poker.size());
			String pai=poker.remove(index);
			System.out.println(pai);
		}
		
		//4.发牌
		List<String> faige=new ArrayList<String>();
		List<String> gaojing=new ArrayList<String>();
		List<String> luoyi=new ArrayList<String>();
		for(int i=0;i<poker.size();i++) {
			//取牌
			String pai=poker.get(i);
			int mod=i%3;
			//前三张的索引
			
			if(mod==0) {
				faige.add(pai);
			}else if(mod==1) {
				gaojing.add(pai);
			}else if(mod==2) {
				luoyi.add(pai);
			}
		}
		System.out.println("faige:"+faige);
		System.out.println("gaojing:"+gaojing);
		System.out.println("luoyi:"+luoyi);
		
		//5.对牌进行排序
		Set<String> faige2=new HashSet<String>();
		for(String fai:faige) {
			faige2.add(fai);
		}
		System.out.println(faige2);
	}
}
