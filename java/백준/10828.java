import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String cmd = br.readLine();
			if(cmd.startsWith("push")) {
				int x = Integer.parseInt(cmd.split(" ")[1]);
				stack.push(x);
			} else if(cmd.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.pop()).append("\n");
				}
			} else if(cmd.equals("size")) {
				sb.append(stack.size()).append("\n");
			} else if(cmd.equals("empty")) {
				sb.append(stack.isEmpty()?1:0).append("\n");
			} else if(cmd.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		System.out.print(sb);
	}

}
