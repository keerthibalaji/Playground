import java.util.Scanner;
class Main{
    public static void main(String args[]){
          Scanner in=new Scanner(System.in);
       int s=in.nextInt();
      int a[]=new int[s];
      for(int i=0;i<s;i++)
      {
        a[i]=in.nextInt();
      }
      int max=a[0];
      for(int i=0;i<s;i++)
      {
        if(a[i]>max)
          max=a[i];
      }
        System.out.println(max);
      
    }
}