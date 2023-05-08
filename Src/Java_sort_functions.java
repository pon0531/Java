
import java.util.Arrays;

public class Java_sort_functions {
	
	static void print_Array(int Arr[])
	{
		for (int s: Arr)
			System.out.print(s+" ");
		//System.out.println();
	}
	
	static int[] gen_random_num_list(int n)
	{
		int[] num_lists = new int[n]; 

		for(int i=0;i<num_lists.length;i++) 
		{
			num_lists[i] = (int) (Math.random()*100);//產生從[0,10)
		}

		return num_lists;
	}
	static void bubble_sort(int[] Arr)
	{
		System.out.println("bubble sort start"); 
		for(int i = 0;i<(Arr.length-1);i++)
		{
			for(int j =i+1;j<(Arr.length);j++)
			{
				if(Arr[i] > Arr[j])
				{
					int temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
			System.out.print("Turn "+i+": ");

			print_Array(Arr);
			System.out.println();
		}

		System.out.println("bubble sort end"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random_nums = 10;
		int[] num_lists = gen_random_num_list(random_nums);
		
		System.out.print("Before Sorted:");	
		print_Array(num_lists);
		System.out.println();
		System.out.println();

		bubble_sort(num_lists);
	
	}
}
