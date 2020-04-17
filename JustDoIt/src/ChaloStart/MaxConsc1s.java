package ChaloStart;

public class MaxConsc1s {
	
	static int getMaxlength(int inputArr[],int n) {
		int result = 0;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(inputArr[i]==0) {
				count = 0;
				}
			else
				count++;
				result = Math.max(result, count);
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[] inputArr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int n = inputArr.length;
        System.out.println(getMaxlength(inputArr,n));
	}

}
