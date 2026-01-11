import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String a = sc.next();
			String b = sc.next();
			
			int reverseA = Integer.parseInt(new StringBuilder(a).reverse().toString());
			int reverseB = Integer.parseInt(new StringBuilder(b).reverse().toString());
			
			if(reverseA>reverseB) {
				System.out.print(reverseA);
			}else {
				System.out.print(reverseB);
			}
		}
}
