import java.util.Scanner;

class arraysort
{
public static void main(String args[])
{
	int temp,i;
int[] my=new int[10];
Scanner s=new Scanner(System.in);
    

 for( i=0; i<5;i++)
	 
    {
   
     my[i]=s.nextInt();   
        
    }

   
    for ( i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (my[i] > my[j]) 
                {
                    temp = my[i];
                    my[i] = my[j];
                    my[j] = temp;
                }
            }
        }
	
	
	
	 for( i=0; i<5;i++)
	 
    {
   
     System.out.print(my[i]+" ");   
        
    }

   
}

}



