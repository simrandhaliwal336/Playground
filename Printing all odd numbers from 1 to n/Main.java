import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     // Type your code here
      int n=0,i=0;
      Scanner in=new Scanner (System.in);
      n=in.nextInt(); 
      for( i=1;i<=n;i++)
      {
        if(i %2!= 0)
         System.out.println(i+"");
	}
}
}