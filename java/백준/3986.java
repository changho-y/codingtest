import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int good = 0;
			for(int i=0; i<n; i++) {
				String word = br.readLine();
				
				if(word.length()%2 == 1) continue;

				Stack<Character> stack = new Stack<>();
				
				for(int j=0; j<word.length(); j++) {
					char c = word.charAt(j);
					if(!stack.isEmpty() && stack.peek() == c) {
						stack.pop();
					} else {
						stack.push(c);
					}
				}				
				if(stack.isEmpty()) good++;
			}
			System.out.println(good);
		}
}
