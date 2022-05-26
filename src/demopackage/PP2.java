package demopackage;

public class PP2
{
public static void main(String[] args)
{
	int length=0;
	int num_hold=0;
	int input_number= 0;
//	int divide=1;
	int all_sum=0;
	int final_sum=0;
	
	for (int i = 153;i <=153 ;i++)
	{
		input_number = i;
		length = 0;
	//	all_sum = 0;
		for(;;)
		{
			length++;
			input_number = input_number/10;
			
			if (input_number == 0) 
			{
				break;
			}

		}
		//System.out.println("total length" + length);
		
		input_number = i;
		final_sum = 0;
		
		for(int j=1;j<=length;j++)
		{
			//System.out.println("input num " + input_number);
			//System.out.println(input_number%10);
			//System.out.println("mod "+ input_number%10);
			num_hold = input_number%10;
			all_sum  = 1;
		
			for(int q=0;q<length;q++)
			{
				all_sum = all_sum*num_hold;
		
			}
			//System.out.println("sum " + all_sum);
			final_sum = final_sum + all_sum;
			input_number = input_number/10;
			
		}
		//System.out.println("FINAL  " + final_sum);
		if(final_sum == i)
		{
			System.out.println("ARMSTRONG NUMBER" + i);
		}
	}
	
}
}
