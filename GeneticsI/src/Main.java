import java.util.Random;
import java.util.Scanner;

public class Main {

	static Random generator = new Random(0);
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
/*
		int n = sc.nextInt();
		int l = sc.nextInt();
		Population t = new Population(n,l);
		
		System.out.println(t);
		
		*/
		
		
		/*String n = sc.next();
		Individual A = new Individual(n);
		int r = A.one();
		
		System.out.println(r);
		*/
		
		/*String n = sc.next();
		Individual a = new Individual(n);
		int r = a.square();
		
		System.out.println(r);
		*/
		
		
		int n = sc.nextInt();
		int size1 = sc.nextInt();

		Population x = new Population(n, size1);

		for(Individual a : x.get_individuos()) {
			a.set_fitness(sc.nextDouble());
		}
		x.tournament(n).forEach(a-> System.out.println(a));

		sc.close();
	}


}