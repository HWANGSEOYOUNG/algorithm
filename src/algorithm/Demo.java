package algorithm;

public class Demo {
	public static void main(String[] args) {
		
		int i = 0;
		int[] a= new int[8];
		int n = 11;
		
		while(n>0) {
			a[i++] = n%2;
			n /= 2;
		}
		
		for (int j = 7; j >= 0 ; j--) {
			System.out.print(a[j]);
		}
	}

}
