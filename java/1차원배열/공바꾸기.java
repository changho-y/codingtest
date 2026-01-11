import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int temp = 0;
			
			int[] basket = new int[n];

			for(int a=0; a<n; a++) {
				basket[a] = a+1;
			}
			for(int b=0; b<m; b++) {
				int i = sc.nextInt();
				int j = sc.nextInt();
				
				temp = basket[i-1];
				basket[i-1] = basket[j-1];
				basket[j-1] = temp;
			}
			for(int c=0; c<basket.length; c++) {
				System.out.print(basket[c] + " ");
			}
		}
}
