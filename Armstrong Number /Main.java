import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in); 
       int num =in.nextInt();
      int originalNum, rem, result = 0;
        originalNum = num;
        while (originalNum != 0)
        {
            rem = originalNum % 10;
            result += Math.pow(rem, 3);
            originalNum /= 10;
        }
        if(result == num)
            System.out.println( "Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}