import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		
		int n = Integer.parseInt(br.readLine());
		int score;
		int add;

		for(int i=0; i<n; i++) {
			String tc = br.readLine();
			add = 0;
			score = 0;
			for(int j=0; j<tc.length(); j++) {
				if(tc.charAt(j) == 'O') {
					add++;
					score += add;
				}
				if(tc.charAt(j) == 'X') {
					add = 0;
				}
			}
			sb.append(score).append("\n");
		}
		System.out.println(sb);
	}

}
