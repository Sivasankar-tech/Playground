import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner n=new Scanner (System.in);
      int n1,n2,n3;
      n1=n.nextInt();
      n2=n.nextInt();
      n3=n.nextInt();
      if((n1>n2)&&(n1>n3))
        System.out.print(n1);
      else if((n2>n3)&&(n2>n1))
        System.out.print(n2);
      else
        System.out.print(n3);
      // Type your code here
    }
}