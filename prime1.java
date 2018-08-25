import java.util.Scanner;

class prime1
{
public static void main(String args[])
{
int flag,d;
Scanner s=new Scanner(System.in);
int a=s.nextInt();

 for(int i=2; i<a;i++)
    {
        flag=0;
		for(int j=2;j<i;j++)
		{
        if(i%j==0)
        {
            flag=1;
			
        }
	
		}
		
		 if (flag==0)
		 {
       System.out.print(i);
		 }
    
    }

   




}

}



