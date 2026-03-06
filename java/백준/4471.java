import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i=1; i<=n; i++) {
				String numLine = br.readLine();
				sb.append(i).append(". ").append(numLine).append("\n");
			}
			System.out.print(sb);
		}
}
