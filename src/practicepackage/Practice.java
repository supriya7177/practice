package practicepackage;

public class Practice
{
   public static void main(String[] args)
   {
//	int year=2020;                                           /leap year
//	System.out.println("Enter an year:: ");
//	
//	if(((year%4==0) && (year%100!=0))||(year%400==0))
//	{
//		System.out.println("Specified year is a leap year");
//	}
//	else 
//	{
//		System.out.println("Specified year is not a leap year");
//	}
	   
//	   int number=-1;
////	   System.out.println(" Enter the number");
//	   if(number>=0)     
//	   {
//		   System.out.println("number is positive");           // to find negative & +ve number
//	   }
//	   else   
//	   {
//		   System.out.println("number is negative");
//	   }
	   
//	   int number=40;
//	   System.out.println("factors of " + number+ " is ");        //to find factors of number
//	   for(int i=1; i<=number; ++i)
//	   {
//		   if(number % i==0)
//	   {
//			   System.out.print(i + " ");
//	   }
//       }
	   
//	   int num=20;                                            // to find table of a number
//	   for(int i=1;i<=10;i++)
//	   {
//		   System.out.println(num + "*" + i +"=" + num*i);
//		   i++;
//	   }
   int n=9;
//   for(int i=1;i<=n;i++) 
//   {
//	   for(int j=i;j<=n;j++)
//	   {
//		   System.out.print("*");
//	   }
//	   System.out.println();
//	   }
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=i;j<=n;j++)
		   {
			   System.out.print(" ");
		   }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
	   }
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(" ");
		   }
		   for(int j=i;j<=n;j++)
		   {
			 System.out.print("*");  
		   }
		   System.out.println();
	   }
	   
   }
   
   }	

   
