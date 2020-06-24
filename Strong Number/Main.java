import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    int Num, Temp, Rem, Sum = 0, i, Fact;
		Scanner sc = new Scanner(System.in);
		Num = sc.nextInt();		
		Temp = Num;
		while( Temp > 0)
		{
			Fact = 1; 
			i = 1; 
		    Rem = Temp % 10;
		    while (i <= Rem)
		    {
		     	Fact= Fact* i;
		     	i++;
		    }
		    Sum = Sum + Fact;
		     Temp = Temp /10;
		}
			if ( Num == Sum )
		{
			System.out.println("Yes");
		}
		else
		{
		   System.out.println("No");
		}
	}
}