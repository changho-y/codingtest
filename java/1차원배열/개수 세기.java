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
		
		String[] str = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");	
		
		for(int i=0; i<n; i++) {
			str[i] = st.nextToken();
		}
		String v = br.readLine();
		int iv = 0;
		for(int j=0; j<n; j++) {
			if(str[j].equals(v)) {
				iv++;
			}
		}
		bw.write(String.valueOf(iv));
		bw.flush();
		bw.close();
		br.close();

	}

}
