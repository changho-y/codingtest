import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; i++) {
			String line = br.readLine();
			String[] words = line.split(" ");
			
			Stack<String> stack = new Stack<>();
			for(String w : words) {
				stack.push(w);
			}
			
			sb.append("Case #").append(i).append(": ");

			while(!stack.isEmpty()) {
				sb.append(stack.pop());
				if(!stack.isEmpty()) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
