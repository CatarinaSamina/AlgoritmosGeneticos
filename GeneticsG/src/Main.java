
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		Individual A = new Individual(n);
		int r = A.one();
		
		System.out.println(r);
		
		sc.close();
	}

	
}
