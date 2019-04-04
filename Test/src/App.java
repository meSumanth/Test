/**
 * 
 */

/**
 * @author SUMANTH
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getAllSubstrings("abcdefghijklmnopqrstuvwxyz");
	}
	
	private static void getAllSubstrings(final String input)
	{
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<=input.length();j++)
			{
				System.out.println(input.substring(i,j));
			}
		}
	}

}
