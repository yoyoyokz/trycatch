
public class EntierNaturelRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			EntierNaturel yo= new EntierNaturel(-3);
		} catch (ConsrtuctorExceptions e) {
		System.out.println("Vous avez fait une erreur \n "+e.getMessage());
			//e.printStackTrace();
		}
		*/
			EntierNaturel x= new EntierNaturel();
			try {
				x.Multiplication(1000000, 200000);
			} catch (ConsrtuctorExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				//x=Integer.valueOf(geti*j).longValue();
			}
			
			
	}
}

	