package practicepackage;

public class LoopPractice
{
	public static void main(String[] args)
	{
//		char n='m';
//		for(char i='a'; i<=n; i++)
//			{
//				for(char j='a'; j<=i; j++)
//				{
//					System.out.print(j );
//			    }
//				System.out.println( );
//		    }                                //1st
//		
		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print("* ");
//			    }
//				System.out.println( );
//		    }                                              //2nd
//		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=i; j<=n; j++)
//				{
//					System.out.print("* ");
//			    }
//				System.out.println( );
//		    }                                          //3rd
		
//		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=i; j<=n; j++)
//				{
//					System.out.print(" ");
//				}
//					for(int j=1;j<=i;j++) 
//					{
//			          System.out.print("*");
//			        }
//				System.out.println();
//		    }                                                  //4th
		
//		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print(" ");
//				}
//					for(int j=i;j<=n;j++) 
//					{
//			          System.out.print("*");
//			        }
//				System.out.println();
//		    }                                                //5th
		
//		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=i; j<=n; j++)
//				{
//					System.out.print(" ");
//				}
//					for(int j=1;j<=i;j++) 
//					{
//			          System.out.print("*");
//			        }
//				System.out.println();
//		    } 
//		for(int i=0; i<=n; i++)
//			{
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print(" ");
//				}
//					for(int j=i;j<=n;j++) 
//					{
//			          System.out.print("*");
//			        }
//				System.out.println();
//		    }                                            //6th
		
//		int n=9;
//		for(int i=1; i<=n; i++)
//			{
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print("* ");
//			    }
//				System.out.println( );
//		    } 
//		
//		for(int i=0; i<=n; i++)
//			{
//				for(int j=i; j<=n; j++)
//				{
//				System.out.print("* ");
//			    }
//				System.out.println( );
//		    }                                             //7th    
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i; j<n;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}                                                 //pyramid
			
			for(int i=n;i>=1;i--)
			{
				for(int k=i; k<n;k++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();                        // inverted pyramid
			}
		
		
			for(int i=1;i<=n;i++)
			{
				for(int k=i; k<n;k++)
				{
					System.out.print(" ");
				}
				for(int j=n;j<=(2*i-1);j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1;i<=9;i++)
			{
				for(int k=1; k<=i;k++)
				{
					System.out.print(" ");
				}
				for(int j=9;j>=(2*i-1);j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
	}
}	
	
	


