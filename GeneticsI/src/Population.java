import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Population implements IProblema{
	
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

	public List<Individual> tournament(int size){
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