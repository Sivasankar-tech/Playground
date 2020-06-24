import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner (System.in);
    int n,n1,n2,n3;
    n=in.nextInt();
    n1=n/100;
    n2=((n%100)/10);
    n3=(n%10)*100;
    //
    System.out.print((n1+(n2*10)+n3));
  }
}