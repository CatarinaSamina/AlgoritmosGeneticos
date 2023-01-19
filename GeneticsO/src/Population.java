import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Population {

	private List<Individual> individuos = new ArrayList<>();
	static Random generator = new Random(0);
	public double total_fitness = 0;


	public Population(int size, int length) {
		for(int i=0; i<size; i++) {
			individuos.add(new Individual(length));
		}
	}

	public Population(){
		individuos = new ArrayList<Individual>();
	}

	public List<Individual> get_individuos(){
		return individuos;
	}

	public List<Individual> binaryTs(int size){
		List<Individual> winners = new ArrayList<>();
		double u;
		double b = size-1;
		int ind1, ind2;
		for (int i = 0; i <= b; i++) {
			u = generator.nextDouble();
			ind1 = randomindex(u, b);
			u = generator.nextDouble();
			ind2 = randomindex(u, b);
			if(individuos.get(ind1).get_fitness() >= individuos.get(ind2).get_fitness() ) {
				winners.add(individuos.get(ind1));
			}
			else
				winners.add(individuos.get(ind2));
		}
		return winners;
	}

	public int randomindex(double u, double b){
		return (int) (0 + Math.round(u * b));
	}

	public List<Individual> rouletteSpin(){

		List<Individual> winners = new ArrayList<Individual>();
		individuos.forEach(a -> total_fitness += a.get_fitness());

		double u = generator.nextDouble();

		for (int i = 0; i < individuos.size(); i++) {

			double pointer = u * total_fitness;
			double searchPointer = 0;
			for (Individual a : individuos) {
				searchPointer += a.get_fitness();
				if(pointer < searchPointer) {
					winners.add(a);
					break;
				}
			}
		}
		winners.sort((s1, s2) -> (int) Math.signum(s1.binary_to_decimal() - s2.binary_to_decimal()));
		return winners;
	}


	public int [] randomPermutation(int n) {

		
		int  [] v = new int[n];

		for (int i = 0; i < n; i++) {
			v[i]= i;
		}
		for (int j = 0; j < v.length-1; j++) {

			double r = generator.nextDouble();
			int r1 = (int) (j + Math.round(r * ((n-1)-j)));
			int temp = v[j];
			v[j] = v[r1];
			v[r1] = temp;

		}

		return v;
	}

	public String toString() 
	{
		String aux ="";
		for(Individual i: individuos) 
		{
			aux += i.toString()+ "\n";
		}
		return aux.substring(0, aux.length()-1);
	}
}