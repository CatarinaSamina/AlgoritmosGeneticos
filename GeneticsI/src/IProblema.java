import java.util.List;

public interface IProblema {
	
	List<Individual> get_individuos();
	
	List<Individual> tournament(int size);
	
	
}
