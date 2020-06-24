import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int num, first, last;
		Scanner in= new Scanner(System.in);
		num= in.nextInt();	
		
		first = num;
		while(first>= 10)
		{
			first = first/ 10;
		}	
		
		last= num % 10;
		System.out.println((first+last)); // Type your code here
    }
}
