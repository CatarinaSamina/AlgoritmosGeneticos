import java.util.ArrayList;
import java.util.List;

public class Individual implements IProblema{

	String S = "" ;
	private double fitness ;

	public Individual (double length){
		for (int i = 0; i < length; i++) {
			double random = Population.generator.nextDouble();
			if (random < 0.5) {
				S += "0";
			}
			else{
				S += "1";	
			}
		}
	}

	public Individual (String content) {
		S = content;
	}

	public int oneMax() {
		int x = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '1') {
				x++;
			}
		}
		return x;
	}
	

	public int square() {
		int value = Integer.parseInt(S,2);
		int result = (int) Math.pow(value, 2);

		return result;
	}

	public List<Individual> onePointCross(Individual ind2){

		List<Individual> output = new ArrayList<Individual>();

		int r = (int) (Population.generator.nextDouble()*(this.S.length()-1));
		String a_temp = "";
		String b_temp = "";

		for (int i = 0; i < S.length(); i++) {
			if(i >= r) {
				a_temp += ind2.S.charAt(i);
				b_temp += this.S.charAt(i);
			}
			else {
				a_temp += this.S.charAt(i);
				b_temp += ind2.S.charAt(i);
			}
		}
		output.add(new Individual(a_temp));
		output.add(new Individual(b_temp));

		return output;
	}

	public List<Individual> twoPointCross(Individual ind2){

		List<Individual> output = new ArrayList<Individual>();
		
		int pointer = (int) (Population.generator.nextDouble()*(this.S.length()-1));
		int pointer2 = (int) (Population.generator.nextDouble()*(this.S.length()-1));
		String a_temp = "";
		String b_temp = "";

		for (int i = 0; i < S.length(); i++) {
			if(i >= pointer) {
				a_temp += ind2.S.charAt(i);
				b_temp += this.S.charAt(i);
			}
			else if(i >= pointer2)
			{
				a_temp += this.S.charAt(i);
				b_temp += ind2.S.charAt(i);
			}
			else {
				a_temp += this.S.charAt(i);
				b_temp += ind2.S.charAt(i);
			}
		}
		
		
		output.add(new Individual(a_temp));
		output.add(new Individual(b_temp));
		
		return output;
	}


	public List<Individual> uniformCross(Individual ind2){

		List<Individual> output = new ArrayList<Individual>();

		String a_temp = "";
		String b_temp = "";

		for (int i = 0; i < S.length(); i++) {
			double r = (Population.generator.nextDouble());
			if(r < 0.5) {
				a_temp += ind2.S.charAt(i);
				b_temp += this.S.charAt(i);
			}
			else {
				a_temp += this.S.charAt(i);
				b_temp += ind2.S.charAt(i);
			}
		}
		output.add(new Individual(a_temp));
		output.add(new Individual(b_temp));

		return output;
	}
	

	public String bitFlip(double prob){
		
		String temp = "";
		
		for (int i = 0; i < S.length(); i++) {
			double r = (Population.generator.nextDouble());
			if(r<prob) {
				if(this.S.charAt(i) == '1') {
					temp += '0';
				}
				else {
					temp += '1';
				}
			}
			else {
				temp += this.S.charAt(i);
			}
		}
		
		return temp;
	}

	public int binary_to_decimal() {
		return Integer.parseInt(S, 2);
	}

	public void set_fitness(double u) {
		fitness = u;
	}

	public double get_fitness() {
		return fitness;
	}

	public String toString() 
	{
		return S;
	}
}