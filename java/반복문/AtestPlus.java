import java.util.Scanner;

public class AtestPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] testCase = new int[n][2];
		for(int i=0;i<n;i++) {
			testCase[i][0] = sc.nextInt();
			testCase[i][1] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			System.out.println(testCase[j][0]+testCase[j][1]);
		}

	}

}
