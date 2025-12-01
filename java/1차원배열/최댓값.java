import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int maxIndex = 0;
		int index = 1;
		
		for(int i=0; i<9; i++) {
			String line = br.readLine();
			int num = Integer.parseInt(line);
			
			if(num>max) {
				max = num;
				maxIndex = index;
			}
			index++;
		}
		String result = max + "\n" + maxIndex;
		bw.write(result);
		bw.flush();
		br.close();
		bw.close();	
	}

}
