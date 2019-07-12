import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     	    Scanner in=new Scanner(System.in);
       int num=in.nextInt();
        int i;
        for(i=1;i<=num;i=i+1)
        {
          if(i%2!=0)
          {
           System.out.println(i);
          }
          }
	}
}