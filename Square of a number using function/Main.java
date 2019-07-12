import java.util.Scanner;
class Main
{
	public static int square_of_a_number(int m)
    {
	   int m1=m*m;
      return m1;
	} 
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int square = square_of_a_number(n);
    System.out.println(square);
  }
    
	     
	
}