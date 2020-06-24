import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
      int n=num/10;
      int n1 =num%10;
	     System.out.println((n1+n));
	}
}