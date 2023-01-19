
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random generator = new Random(0);

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		Population t = new Population(n,l);
		
		System.out.println(t);
		
		sc.close();
	}
}