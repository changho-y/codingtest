import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] alphabet = new int[26];
			
			for(int j=0; j<26; j++) {
				alphabet[j] = -1;
			}
			
			String s = sc.next();
			
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				int index = ch - 'a';
				
				if(alphabet[index] == -1) {
					alphabet[index] = i;
				}
			}
			
			for(int val : alphabet) {
				System.out.print(val + " ");
			}
		}
}
