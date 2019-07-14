package Example0713;

public class Demo01 {
	public static void main(String[] args) {
		//冒泡排序
		//1.声明一个数组
		int[] arr= {10,5,9,152,36,47,19};
		
		//外层循环
		for(int i=0;i<arr.length-1;i++) {
			//内层循环
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int swap=0;
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}
