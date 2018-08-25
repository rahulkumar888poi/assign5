import java.util.Scanner;

class armstrong
{
public static void main(String args[])
{
int flag=0,d,e;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
e=a;
 while(a>0)
 {
	d=a%10;
flag=flag+(d*d*d);
a=a/10;	
	 
	
	 
 }
if(e==flag)
	{
System.out.print("armstrong");
	}
	else
	{
System.out.print("Not armstrong");
	}
   




}

}



