import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(h==0 && m<45) {
			System.out.println("23 "+(60-(45-m)));
		}else if(h>0 && m<45) {
			System.out.println((h-1)+"  "+(60-(45-m)));
		}else if(h==0 && m>=45) {
			System.out.println("0 "+(m-45));
		}else if(h>0 && m >=45) {
			System.out.println((h-1)+" "+(m-45));
		}
	}

}
