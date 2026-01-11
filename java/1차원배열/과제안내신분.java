import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			boolean[] students = new boolean[31];
			
			
			for(int i=1; i<29; i++) {
				int temp = sc.nextInt();
				students[temp] = true;
			}
			for(int j=1; j<students.length; j++) {
				if(students[j]==false) {
					System.out.println(j);					
				}
			}
		}
}
