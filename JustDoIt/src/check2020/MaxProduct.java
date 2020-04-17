package check2020;

public class MaxProduct {

	public static void main(String[] args) {
		int[] arr = {-1, -3, -4, 2, 0, -5};
		
		System.out.println(checkMaxProd(arr));

	}

	private static int checkMaxProd(int[] arr) {
		int max = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int curProd = arr[i] * arr[j];
				if(curProd > max) {
					max = curProd;
				}		
			}
		}
		return max;
	}

}
