import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int arr[] = new int[26];
			
			for(int i=0; i<26; i++) {
				arr[i] = -1;
			}

			String s = br.readLine();
			
			for(int i=0; i<s.length(); i++) {
				int c = s.charAt(i) - 'a';
				
				if(arr[c] == -1) {
					arr[c] = i;		
				}
			}
			
			for(int i=0; i<26; i++) {
				System.out.print(arr[i]+" ");
			}			
		}
}
