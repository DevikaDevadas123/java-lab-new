import java.io.*;
import java.util.*;
{
class sumOdd
{
public static void main(string args[])
{
 int N[],i,sum;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a 4 digit number: ");
 for(i=0;i<4;i++)
 {
 N[i]=sc.nextInt();
 }
 for(i=0;i<N;i++)
 {
  if(N[i]%2!=0)
  {
   sum= sum+N[i];
   sum= sc.nextInt();
   }
   else
   System.out.println("There is no odd number in the list");
  }
  System.out.println("The sum of odd numbers is" +sum);
 }
}
}
