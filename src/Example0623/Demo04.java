package Example0623;

public class Demo04 {
	public static void main(String[] args) {
		int arr[]= {25,15,36,8,20};
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
		
			if(max>arr[i]) {
				max=max;
			}else {
				max=arr[i];
			}
		}
		System.out.println("最大值为："+max);
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}else {
				min=min;
			}
		}
		System.out.println("最小值为："+min);
	}
}
