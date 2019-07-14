package Example0713;

public class Demo02 {
	public static void main(String[] args) {
		//高级选择排序
		int[] arr= {34,56,88,12,6,9,13};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}
