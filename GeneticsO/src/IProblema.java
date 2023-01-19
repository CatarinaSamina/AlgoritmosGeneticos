import java.util.List;

public interface IProblema {
	int oneMax();
	
	int binary_to_decimal();
	
	double get_fitness();
	
	int square();
	
	List<Individual> onePointCross(Individual ind2);
	
	List<Individual> twoPointCross(Individual ind2);	
	
	List<Individual> uniformCross(Individual ind2);
	
	String bitFlip(double prob);
}
