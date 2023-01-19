import java.util.Random;

public class Individual {

	private static String S = "";
	static Random generator = new Random(0);
	
	public Individual(String a) {
		S=a;
	}

	public int square () {
		int value = Integer.parseInt(S,2);
		int result = (int) Math.pow(value, 2);

		return result;
	}
	public String toString() 
	{
		return S;
	}
}