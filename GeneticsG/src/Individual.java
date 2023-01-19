import java.util.Random;

public class Individual {
	
	static Random generator = new Random(0);
	private static String S = "";

	public Individual(String a) {
		S=a;
	}

	
	public int one() {
		int count = 0;
		for(int i=0; i<S.length(); i++) {

			if(S.charAt(i) == '1'){
			count++;
			}
		}
		return count;
	}
	public String toString() 
	{
		return S;
	}
}
