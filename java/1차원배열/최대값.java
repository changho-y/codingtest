import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] arr = new int[9];
			int max = 0;
			int index = 0;
			int count =0;
			
			for(int i=0; i<9; i++) {
				arr[i] = sc.nextInt();
			}
			
			max = arr[0];
			
			for(int j=0; j<9; j++) {
				count++;
				if(arr[j] > max) {
					max = arr[j];
					index = count;
				}
			}
			System.out.println(max);
			System.out.print(index);
		}
}
