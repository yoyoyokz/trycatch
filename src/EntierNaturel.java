import java.lang.Integer;
public class EntierNaturel  {
private int i;
	private int  j;
private int n;

/*public EntierNaturel(int n) throws ConsrtuctorExceptions {
	super();
	this.n = n;
	if(n<0)
	{
		throw new ConsrtuctorExceptions (n,"Veuillez changer de nombre") ;
	}
	
}
*/
public EntierNaturel() {
	
	// TODO Auto-generated constructor stub
}

public EntierNaturel(int i, int j) {
	
	// TODO Auto-generated constructor stub
}

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}

public int getJ() {
	return j;
}

public void setJ(int j) {
	this.j = j;
}

public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}
public static void  Multiplication (int i,int j) throws ConsrtuctorExceptions
{
	int resultat;
	resultat=i*j;
	long x;
	if(Integer.valueOf(resultat)<0)
	{
		throw new ConsrtuctorExceptions(resultat, "Vous avez dépassez le seuil");
				
		
	}
	else
	{
		System.out.println(""+resultat);
		
	}
	
	
	
}
public static void  Addition (int i,int j) throws ConsrtuctorExceptions
{
	int resultat;;
	resultat=i+j;
	if(Integer.valueOf(resultat)<0)
	{
		throw new ConsrtuctorExceptions(resultat, "Vous avez dépassez le seuil");
		
	}
	else
	{
		System.out.println(""+resultat);
		
	}
	
	
}
public static void  Soustraction (int i,int j) throws ConsrtuctorExceptions
{
	int resultat;;
	resultat=i-j;
	if(Integer.valueOf(resultat)<0)
	{
		throw new ConsrtuctorExceptions(resultat, "Vous avez dépassez le seuil");
		
	}
	else
	{
		System.out.println(""+resultat);
		
	}
	
	
}
}
