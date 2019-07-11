package Example0708;

public class Demo04 {
	public static void main(String[] args) {
		//把数组中的数据按照指定的格式拼接成字符串
		//eg:int[] arr= {1,2,3} 转换成 "[1,2,3]"
		
		//声明一个数组
		int[] arr= {1,2,3};
		
		//声明一个字符串
		String str="[";
		
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {   //遍历到最后一次
			    str=str+arr[i]+"]";
			}else {
				str=str+arr[i]+",";
			}
		}
		System.out.println(str);
	}
}
