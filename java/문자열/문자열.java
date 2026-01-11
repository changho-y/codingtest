import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int t = sc.nextInt();
			
			String[] tc = new String[t];

			for(int i=0; i<t; i++) {
				tc[i] = sc.next();
			}
			for(int j=0; j<t; j++) {
				char first = tc[j].charAt(0);
				char last = tc[j].charAt(tc[j].length()-1);
				System.out.println(""+first+last);
			}
			
		}
}
