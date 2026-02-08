import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		int max = 0;
		int stick = 0;
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			stack.push(num);
		}
		for(int i=0; i<n; i++) {
			int pop = stack.pop();
			if(pop > max) {
				max = pop;
				stick++;
			}
		}
		System.out.print(stick);
	}

}
