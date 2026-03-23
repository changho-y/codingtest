import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			int arr[] = new int[26];
			
			int max = -1;
			int ch = -2;
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) >= 97) {
					arr[str.charAt(i) - 97]++;
				} else {
					arr[str.charAt(i) - 65]++;
				}
			}
			
			for(int i=0; i<26; i++) {
				if(arr[i]>max) {
					max = arr[i];
					ch = i;
				} else if(arr[i] == max) {
					ch = -2;
				}
			}
			System.out.print((char)(ch+65));

	
		}
}
