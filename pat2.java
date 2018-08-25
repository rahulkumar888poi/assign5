import java.util.Scanner;

class pat2
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
int a=s.nextInt();


for(int i=1;i<=a;i++)
{
	
for(int j=5;j>=i;j--)
{
	
System.out.print("*");	
	
}
System.out.println();
}

}
}


