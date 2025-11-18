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
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");	
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		String[] str = new String[n];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			str[i] = st2.nextToken();
		}

		for(int j=0; j<n; j++) {
			if(Integer.parseInt(str[j])<x) {
				bw.write(String.valueOf(Integer.parseInt(str[j]))+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
