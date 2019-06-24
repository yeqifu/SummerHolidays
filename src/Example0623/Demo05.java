package Example0623;

public class Demo05 {
	public static void main(String[] args) {
		//冒泡排序
		int arr[]= {120,100,7,5,78,56};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("数组中最大的数为："+arr[5]);
		System.out.println("数组中最小的数为："+arr[0]);
	}
}
