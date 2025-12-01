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
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // 바구니 수
		int[] num = new int[n];
		int m = Integer.parseInt(st.nextToken()); // m번 반복
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(int a=0; a<m; a++) {
			StringTokenizer ijk = new StringTokenizer(br.readLine(), " ");

			i = Integer.parseInt(ijk.nextToken());
			j = Integer.parseInt(ijk.nextToken());
			k = Integer.parseInt(ijk.nextToken());
			for(int b=i; b<=j; b++) {
				num[b-1] = k;
			}
		}
		for(int c=0; c<n; c++) {
			bw.write(String.valueOf(num[c]));
			bw.write(" ");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
