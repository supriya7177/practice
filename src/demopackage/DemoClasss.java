package demopackage;

public class DemoClasss
{
	public static void main(String[] args) 
	{
//      for (int i=1;i<=5;i++)
//      {
//    	 for(int j=1; j<=i; j++) 
//    	 {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println();     //right angle triangle
//      }
//      
//      for(int i=1;i<=4;i++)
//      {
//    	  for(int j=4; j>=i;j--)
//    	  {
//    		  System.out.print("*");
//    	  }
//    	  System.out.println();    //inverted right angle triangle
//      }
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int k=1;k<=5-i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		//	System.out.print(" inverted mirror image of right angle triangle");
//		}
		
		for(int i=1;i<=5;i++)
		{
			for(int k=i; k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	for(int i=5;i>=1;i--)
	{
		for(int k=i; k<5;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}

	for(int i=5;i>=1;i--)
	{
		for(int k=i; k<5;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
		for(int i=1;i<=5;i++)
		{
			for(int k=i; k<5;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	for(int i=1;i<=5;i++)
	{
		for(int k=1; k<=i;k++)
		{
			System.out.print(" ");
		}
		for(int j=5;j>=(2*i-1);j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}	
}


	

