import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int firstNum = Integer.parseInt(st.nextToken());
		int max = firstNum;
		int min = firstNum;
		
		for(int i=1; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num<min) {
				min = num;
			}
			if(num>max) {
				max = num;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();

	}

}
