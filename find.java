import java.util.Scanner;

class find
{
public static void main(String args[])
{
	int temp,i;
int[] my=new int[10];
Scanner s=new Scanner(System.in);
System.out.println("Enter number to check ");   
    temp=s.nextInt();

 for( i=0; i<5;i++)
	 
    {
   
     my[i]=s.nextInt();   
        
    }

   
    for ( i = 0; i < 5; i++) 
        {
            
			if(temp==my[i])
			{
				
				System.out.print("Number is in array");   
				
			}
			
			
			
        }
	System.out.print("Not Found ");   
	
	
	

   
}

}



