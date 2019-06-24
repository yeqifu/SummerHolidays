package Example0623;

public class Demo06 {
	public static void main(String[] args) {
		int[] arr= {12,56,10,34,67};
		int count=arr.length/2;
		for(int i=0;i<count;i++) {
			//左边的索引
			int left=i;
			//右边的索引
			int right=arr.length-i-1;
			
			int temp=0;
			temp=arr[left];
			arr[i]=arr[right];
			arr[right]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
