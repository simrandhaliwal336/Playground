import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int l,num;
      Scanner in=new Scanner(System.in);
      l=in.nextInt();
      num=(l/10)%10;
      System.out.println(num);
	}
}