package Example0712;

public class Demo02 {
	public static void main(String[] args) {
		/*StringBuffer的删除、替换、截取功能
		1.public StringBuffer deleteCharAt(int index):
			删除指定位置的字符，并返回本身
		2.public StringBuffer delete(int startIndex,int endIndex):
			删除从指定位置开始，指定位置结束的内容，并返回本身
		3.public StringBuffer replace(int startIndex,int endIndex,String str)
			用str替换从startIndex到endIndex-1之间的字符串
		4.substring()	
			*/
		
		StringBuffer s=new StringBuffer("Scarlett Johansson");
		//打印一个对象，其实会调用内部的toString方法
		//toString方法把字符数组转成字符串，char[]->String
		System.out.println(s);
		
		//删除指定位置的字符
		s.deleteCharAt(0);
		System.out.println(s);
		
		//删除一段字符
		s.delete(0, 6);
		System.out.println(s);
		
		//替换一段字符串
		s.replace(0, 1,"S");
		System.out.println(s);
		
		//截取一段字符串
		//从指定位置截取到末尾，这个方法的返回值类型是String,不是StringBuffer
		String a=s.substring(2);
		System.out.println(a);
		
		String b=s.substring(0, 1);
		System.out.println(b);

	}
}
