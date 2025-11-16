import java.util.Scanner;

public class Longint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int lonint = n/4;
		
		for(int i=0; i<lonint; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}

}
