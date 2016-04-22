
public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		try{
		int num=Integer.parseInt ("XYZ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException caught gracefully");
		}
	}

}
