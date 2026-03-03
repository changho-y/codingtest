
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			LinkedList<Integer> q = new LinkedList<>();
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0; i<n; i++) {
				String[] command = br.readLine().split(" ");
				switch(command[0]) {
				
				case "push":
					q.add(Integer.parseInt(command[1]));
					break;
				
				case "pop":
					if(q.size() == 0) {
						sb.append(-1).append("\n");
					} else {
						int temp = q.get(0);
						q.remove(q.get(0));
						sb.append(temp).append("\n");
					}
					break;
				case "size":	
					sb.append(q.size()).append('\n');
					break;
					
				case "empty":
					if(q.isEmpty()) {
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
					
				case "front":
					if(q.size() == 0) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(q.get(0)).append('\n');
					}
					break;
					
				case "back":
					if(q.size() == 0) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(q.get(q.size() - 1)).append('\n');
					}
					break;
				}
			}
			System.out.println(sb);
			
		}
}
