import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n1,n2,n,sum;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      n1=n/100;
      n2=(n%10)%10;
      sum=n1+n2;
      System.out.println(sum);
	}
}