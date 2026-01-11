import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] basket = new int[n+1];
			
			for(int b=1; b<basket.length; b++) {
				basket[b] = b;
			}
			for(int a=0; a<m; a++) {
				int i = sc.nextInt();
				int j = sc.nextInt();
				
				while(i<j) {
					int temp = basket[i];
					basket[i] = basket[j];
					basket[j] = temp;
					i++;
					j--;
				}
			}
			for(int c=1; c<=n; c++) {
				System.out.print(basket[c] + " ");
			}
		}
}
