package Example0723;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
	/*	1.准备一副牌(54张)
		 * 2.洗牌(打乱牌的顺序)
		 * 3.留三张底牌
		 * 4.发牌(三个人)
		 * 5.每个人拿到牌后，对牌进行排序
		 * 6.出牌...*/

		//1.准备一副牌(54张)
		Map<Integer,String> poker=new HashMap<Integer,String>();
		//花色
		String[] colors= {"黑桃","红心","梅花","方块"};
		//牌的数字
		String[] nums= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		//遍历
		int index=0;
		for(String num:nums) {
			for(String color:colors) {
				String s=color+num;
				poker.put(index,s);
				index++;
			}
		}
		//添加大王小王
		poker.put(index, "小王");
		index++;
		poker.put(index, "大王");
		System.out.println("==============遍历poker==============");
		for(Entry<Integer,String> pokers:poker.entrySet()) {
			System.out.println(pokers.getKey()+":"+pokers.getValue());
		}
		//2.洗牌
		//2.1获取牌的索引
		Set<Integer> pokerKeys=poker.keySet();
		
		//2.2将Set转换成list
		List<Integer> pokerIndexs=new ArrayList<Integer>();
		for(Integer lists:pokerKeys) {
			pokerIndexs.add(lists);
		}
		//2.3将索引打乱
		Collections.shuffle(pokerIndexs);
		System.out.println(pokerIndexs);
		
		//3.留底牌
		Set<Integer> dipaiIndexs=new TreeSet<Integer>();
		dipaiIndexs.add(pokerIndexs.remove(0));
		dipaiIndexs.add(pokerIndexs.remove(0));
		dipaiIndexs.add(pokerIndexs.remove(0));
		System.out.println("===========底牌的索引============");
		System.out.println("dipaiIndexs:"+dipaiIndexs);
		List<String> list=new ArrayList<>();
		for(Integer dipai:dipaiIndexs) {
			list.add(poker.get(dipai));
		}
		System.out.println("底牌是："+list);
		//4.发牌
		Set<Integer> faigeIndexs=new TreeSet<Integer>();
		Set<Integer> gaojingIndexs=new TreeSet<Integer>();
		Set<Integer> luoyiIndexs=new TreeSet<Integer>();
		for(int i=0;i<pokerIndexs.size();i++) {
			//取出扑克牌的索引
			int pokerIndex=pokerIndexs.get(i);
			int mod=i%3;
			if(mod==0) {
				faigeIndexs.add(pokerIndex);
			}else if(mod==1) {
				gaojingIndexs.add(pokerIndex);
			}else if(mod==2) {
				luoyiIndexs.add(pokerIndex);
			}
		}
		//5.打印每个人牌的索引
		System.out.println("faige:"+faigeIndexs);
		System.out.println("gaojing:"+gaojingIndexs);
		System.out.println("luoyi:"+luoyiIndexs);
		
		//6.看牌
		lookPoker("faige", poker, faigeIndexs);
		lookPoker("gaojing", poker, gaojingIndexs);
		lookPoker("luoyi", poker, luoyiIndexs);
		
	}
	public static void lookPoker(String name,Map<Integer,String> poker,Set<Integer> playerPokerIndex) {
		System.out.println(name+":");
		
		List<String> pokerValues = new ArrayList<String>();
		//遍历玩家的扑克牌索引
		for(Integer key:playerPokerIndex) {
			pokerValues.add(poker.get(key));
		}
		System.out.println(pokerValues);
	}
}
