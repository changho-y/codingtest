import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			int count = 0;
			
			for(int i=0; i<str.length(); i++) {

				if(i<str.length()-2 && str.substring(i, i+3).equals("dz=")) {
					count++;
					i+=2;
				} else if(i<str.length()-1) {
					String temp = str.substring(i, i+2);
					if((temp.equals("c=") 
							|| temp.equals("c-")
							|| temp.equals("d-")
							|| temp.equals("lj")
							|| temp.equals("nj")
							|| temp.equals("s=")
							|| temp.equals("z="))) {
								count++;
								i++;
				} else {
					count++;
				}
				} else {
					count++;
				}
			}			
			System.out.print(count);
		}
}
