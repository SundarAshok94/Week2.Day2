package Week2.Day2_ReturnStatement1;

public class FindIntersection {
	public static void main(String[] args) {

		int[] a= {3,2,11,4,9,6,7};
		int[] b={1,2,8,4,9,7};
		int a1=a.length;
		int b1=b.length;
		System.out.println("The length of Array  A and B is "  +a1 +" " +    "and" + " "+   +b1);
		System.out.println("Intersection values are");

		{		for(int i=0;i<a1;i++) {
			for(int j=0;j<b1;j++){
				if(a[i]==b[j]) {
					System.out.println(a[i]);


				}

			}


		}
		}}

}
