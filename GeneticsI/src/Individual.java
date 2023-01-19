import java.util.Random;

public class Individual {

	String S = "" ;
	private double fitness ;
	static Random generator = new Random(0);
	
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
	
	public int square () {
		int value = Integer.parseInt(S,2);
		int result = (int) Math.pow(value, 2);

		return result;
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