
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int[] arr = new int[10];
			
			for(int i=0; i<10; i++) {
				arr[i] = 0;
			}

			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			
			int n = a*b*c;
			String s = String.valueOf(n);
			
			for(int i=0; i<10; i++) {
				int count = 0;
				for(int j=0; j<s.length(); j++) {
					if((s.charAt(j) - '0') == i) count++;
				}
				System.out.println(count);
			}
		}
}
