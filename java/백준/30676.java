import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int star = Integer.parseInt(br.readLine());
			
			String color;
			if(star >= 620 && star <= 780) {
				color = "Red";
			} else if(star >= 590 && star < 620) {
				color = "Orange";
			} else if(star >= 570 && star < 590) {
				color = "Yellow";
			} else if(star >= 495 && star < 570) {
				color = "Green";
			} else if(star >= 450 && star < 495) {
				color = "Blue";
			} else if(star >= 425 && star < 450) {
				color = "Indigo";
			} else if(star >= 380 && star < 425) {
				color = "Violet";
			} else {
				color = "No";
			}
			
			System.out.print(color);
			
		}
}
