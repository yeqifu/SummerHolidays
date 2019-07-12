package Example0711;

public class Demo04 {
	public static void main(String[] args) {
		//计算字符串出现的次数
		//helgyfnsefgyfsdfsdfgyfgyfgyf
		String s1="helgyfnsefgyfsdfsdfgyfdcgyfgyf";
		String s2="gyf";
		int count=0;
//		for(int index=0;index<s1.length();) {
//			int a=s1.indexOf(s2,index);
////			System.out.println(a);
//			index=(a+3);
//			count++;
//		}
//		System.out.println(count);
		
		while(true) {
			System.out.println(s1);
			int index=s1.indexOf(s2);
			if(index==-1) {	//没找到，退出循环
				break;
			}
			
			//找到，截取字符串，+1
			s1=s1.substring(index+s2.length());
			count++;
		}
		System.out.println(s2+"出现的次数为"+count);
	}
}
