package Example0713;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * 二分查找（又称为折半查找）
		 优点：比较次数少，查找速度快，平均性能好
		 缺点：要求待查找的为有序表
		 二分查找的目的是查找元素的索引
		*/
		
		int[] arr= {10,23,66,67,89};
		int num=67;
		System.out.println(num+"索引："+getIndex(arr,num));
	}
	/**
	 * 找到num在数组arr中的索引
	 * @param arr  传入的数组
	 * @param num	传入的需要查找的数字
	 * @return		返回查找的数字的索引
	 */
	public static int getIndex(int[] arr,int num) {
		
		
		int min=0;
		int max=arr.length-1;
		int mid=(max+min)/2;
		int index=-1;
		while(true) {
			
			if(arr[mid]==num) {
				index=mid;
				break;			//退出循环
			}
			
			if(arr[mid]>num) {	//要查的数在mid的左边
				max=mid-1;
				mid=(max+min)/2;
			}
			if(arr[mid]<num) {	//要查的数在mid的右边
				min=mid+1;
				mid=(min+max)/2;
			}
			if(min>max) {	//不复合逻辑，退出循环
				break;
			}
		}
		return index;
	}
}
