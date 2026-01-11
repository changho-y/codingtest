import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] basket = new int[n];

			for(int q=0; q<m; q++) {
				int i = sc.nextInt();
				int j = sc.nextInt();
				int k = sc.nextInt();
				
				for(int w=i-1; w<j; w++) {
					basket[w] = k;
				}
			}
			for(int e=0; e<basket.length; e++) {
				System.out.print(basket[e] + " ");
			}
		}
}
