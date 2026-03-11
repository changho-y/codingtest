import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int leap = Integer.parseInt(br.readLine());
			
			if(leap%4 == 0 && leap%100 != 0 || leap%4 == 0 && leap%400 == 0) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}
}
