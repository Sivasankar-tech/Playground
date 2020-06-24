import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int num, i,j=1;
		Scanner in = new Scanner(System.in);
	num = in.nextInt();	
		
		for(i = 1; j <= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i);j++;
              
			}
		}	
	}
}