import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String a = br.readLine();
			String b = br.readLine();
			int c = Integer.parseInt(br.readLine());

			int sum = Integer.parseInt(a)+Integer.parseInt(b)-c;
			String ab = a+b;
			
			System.out.println(sum);
			System.out.print(Integer.parseInt(ab) - c);

		}
}
