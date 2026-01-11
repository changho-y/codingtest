import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			String num = sc.next();
			
			int result = 0;
			
			for(int i=0; i<t; i++) {
				result += num.charAt(i)-'0';
			}
			System.out.println(result);
		}
}
