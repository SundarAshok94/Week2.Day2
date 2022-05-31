package Week2.Day2_ReturnStatement1;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public int MissingElementInAnArray(int []arr) {
		int length=arr.length;
		int i;

	for(i=1;i<length;i++) {
	     if(i!=arr[i-1])
{
break;
}
}
	return i;
	}
	
	public static void main(String[] args) {
		MissingElementInAnArray me=new MissingElementInAnArray();
		
		int[] arr= {1,2,3,4,6,7,8,9};
		Arrays.sort(arr);
     System.out.println(me.MissingElementInAnArray(arr));
		
	}
}
