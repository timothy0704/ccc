import java.util.Scanner;

public class P1473 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		
		int G = sc.nextInt();
		
		int B = sc.nextInt();
		
		
		int result = (R*3) + (G*4) + (B*5);
		
		System.out.println(result);
		
		sc.close();
		
		return;
	}
}
