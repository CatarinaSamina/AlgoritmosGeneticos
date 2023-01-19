import java.util.ArrayList;
import java.util.List;
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
		
		/*
		int n = sc.nextInt();
		int size1 = sc.nextInt();

		Population x = new Population(n, size1);

		for(Individual a : x.get_individuos()) {
			a.set_fitness(sc.nextDouble());
		}
		x.tournament(n).forEach(a-> System.out.println(a));

		sc.close();
		*/
		
/*
		Population p = new Population();
		
		while(sc.hasNext()) {
			String s = sc.nextLine();
			String[] split = s.split(" ");
			Individual ind = new Individual(split[0]);
			ind.set_fitness( Double.parseDouble(split[1]));
			p.get_individuos().add(ind);
		}
		List<Individual> lastSort = new ArrayList<>();
		p.get_individuos().sort((s1, s2) -> (int) Math.signum(s2.get_fitness() - s1.get_fitness()));
		lastSort = p.rouletteSpin();
		for (Individual a : lastSort) {
			System.out.println(a);
		}
		
		sc.close();
		*/
		
		List<Individual> f = new ArrayList<Individual>(); 

		String parent1 = sc.nextLine();
		String parent2 = sc.nextLine();

		Individual a = new Individual(parent1);
		Individual b = new Individual(parent2);

		f = a.twoPointCross(b);
		for (Individual c : f) {
			System.out.println(c);
		}

		sc.close();
	}


}