import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int[] light = new int[n];
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<n; i++) {
				light[i] = Integer.parseInt(st2.nextToken());
			}
			for(int i=0; i<m; i++) {
				StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
				int command = Integer.parseInt(st3.nextToken());
				int a = Integer.parseInt(st3.nextToken());
				int b = Integer.parseInt(st3.nextToken());
				if(command == 1) {
					light[a-1] = b;
				} else if(command == 2) {
					for(int j=a-1; j<b; j++) {
						if(light[j] == 0) {
							light[j] = 1;
						} else {
							light[j] = 0;							
						}
					}
				} else if(command == 3) {
					for(int j=a-1; j<b; j++) {
						light[j] = 0;
					}
				} else if(command == 4) {
					for(int j=a-1; j<b; j++) {
						light[j] = 1;
					}
				}
			}
			for(int i=0; i<n; i++) {
				sb.append(light[i]).append(" ");
			}
			System.out.print(sb);
		}
}
