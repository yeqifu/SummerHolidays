package Example0712;

public class Demo04 {
	public static void main(String[] args) {
		//把数组转换成字符串，用StringBuffer实现
		//举例：int[] arr={1,2,3};   [1,2,3]
		
		//1.声明一个数组
		int arr[]= {6,5,8};
		
		//2.声明字符串缓冲区对象
		StringBuffer s=new StringBuffer();
		s.append("[");
		//3.遍历元素
		for(int i=0;i<arr.length;i++) {
			s.append(arr[i]);
			if(i==arr.length-1) {	//最后一个
				s.append("]");
			}else {
				s.append(",");
			}
		}
		System.out.println(s.toString());
	}
}
