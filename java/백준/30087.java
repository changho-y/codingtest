import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String seminar = br.readLine(); 
				if(seminar.equals("Algorithm")) {
					sb.append(204).append("\n");
				} else if(seminar.equals("DataAnalysis")) {
					sb.append(207).append("\n");
				} else if(seminar.equals("ArtificialIntelligence")) {
					sb.append(302).append("\n");
				} else if(seminar.equals("CyberSecurity")) {
					sb.append("B101").append("\n");
				} else if(seminar.equals("Network")) {
					sb.append(303).append("\n");
				} else if(seminar.equals("Startup")) {
					sb.append(501).append("\n");
				} else if(seminar.equals("TestStrategy")) {
					sb.append(105).append("\n");
				}
			}
			System.out.print(sb);
			
		}
}
