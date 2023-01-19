import java.util.ArrayList;
import java.util.List;

public class Population {
	
	private List<Individual> individuos = new ArrayList<>();
	
	public Population(int n, int l) {
		
		for(int i=0; i<n; i++) {
			individuos.add(new Individual(l));
		}
		
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