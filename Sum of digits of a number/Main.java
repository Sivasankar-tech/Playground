import java.util.Scanner;

 class Main
 {
	public static void main(String[] args) {
		int Num, Rem, Sum = 0;
		Scanner in = new Scanner(System.in);		
		//System.out.println("Please Enter any Number: ");
		Num = in.nextInt();
		
		while(Num > 0) {
			Rem = Num % 10;
			Sum = Sum+ Rem;
			Num = Num / 10;
		}
		System.out.print(Sum);
	}
}