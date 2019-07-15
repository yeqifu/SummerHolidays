package Example0714;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		
		int[] arr1= {23,55,69,14,78};
		int[] arr2=new int[3];
		
		System.arraycopy(arr1, 0, arr2, 0, 3);
		System.out.println(Arrays.toString(arr2));
	}
}
 