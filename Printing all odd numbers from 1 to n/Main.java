import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int num, i;
		Scanner in = new Scanner(System.in);
	num = in.nextInt();	
		
		for(i = 1; i <= num; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i); 
			}
		}	
	}
}