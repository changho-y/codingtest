import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		boolean[] stuCheck = new boolean[31];
		int no1 = 0; 
		int no2 = 0;
		
		for(int i=0; i<28; i++) {
			stuCheck[Integer.parseInt(br.readLine())] = true;
		}
		for(int j=1; j<=30; j++) {
			if(!stuCheck[j]) {
				if(no1==0) {
					no1 = j;
				}else {
					no2 = j;
				}
			}
		}

		bw.write(String.valueOf(no1));
		bw.newLine();
		bw.write(String.valueOf(no2));

		bw.flush();
		br.close();
		bw.close();
	}

}
