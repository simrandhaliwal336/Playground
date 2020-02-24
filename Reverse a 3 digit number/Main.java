import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     int n,rev;
      Scanner in=new Scanner(System.in);
      n=in.nextInt();
      
    rev=(n/100)+(n/10%10)*10+n%10*100;
    
      System.out.println(rev);
  }
}