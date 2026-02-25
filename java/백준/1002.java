import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			int dx = x1 - x2;
			int dy = y1 - y2;
			int d2 = dx*dx + dy*dy;
			
			int sum = r1 + r2;
			int sum2 = sum*sum;
			
			int diff = Math.abs(r1-r2);
			int diff2 = diff*diff;
			
			if(d2 == 0 && r1 == r2) {
				sb.append(-1).append("\n");
			} else if(d2 > sum2) {
				sb.append(0).append("\n");
			} else if(d2 < diff2) {
				sb.append(0).append("\n");
			} else if(d2 == sum2 || d2 == diff2) {
				sb.append(1).append("\n");
			} else {
				sb.append(2).append("\n");
			}
		}
		System.out.print(sb);
	}

}
