
public class Individual {

	private String S = "";

	public Individual(int l) {
		for(int i=0; i<l; i++) {
			double u = Main.generator.nextDouble();
			if(u<0.5) {
				S+= "0";
			}
			else
				S+= "1";
		}
	}
	
	public String toString() 
	{
		return S;
	}
}
