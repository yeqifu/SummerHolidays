package Example0624;

public class Demo01 {
	public static void main(String[] args) {
		//二维数组的遍历
		int sum=0;
		int[][] arr= {{56,66,89,22},{76,87,99},{60},{53,68}};
		for(int i=0;i<arr.length;i++) {
			int[] arr1=arr[i];
			for(int j=0;j<arr1.length;j++) {
				System.out.println(arr1[j]);
				sum=sum+arr1[j];
			}
		}
		System.out.println("二维数组的和为："+sum);
	}
}
