package Example0625;

public class Demo04 {
	public static void main(String[] args) {
		int[] arr= {5,3,6,8,4};
		ArrayTool arr2=new ArrayTool(arr);
		System.out.println("数组中的最大值为：");
		System.out.println(arr2.getArrayMax(arr));
		
		System.out.println("数组中的元素为：");
		arr2.showArray(arr);
		
		System.out.println("\n"+"数组反转：");
		arr2.swapArray(arr);
		
	}
}
class ArrayTool{
	int[] arr;
	public ArrayTool() {
		
	}
	public ArrayTool(int[] arr) {
		this.arr = arr;
	}
	public int getArrayMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public void showArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	public void swapArray(int[] arr) {
		int count=arr.length/2;
		
		for(int i=0;i<count;i++) {
			int temp=0;
			int left=i;
			int right=arr.length-i-1;
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}