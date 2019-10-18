import java.util.*;

public class SieveOfEratosthenes
{
	static ArrayList<Integer> primesArr = new ArrayList<>();

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] isprime = new boolean[n];
		for(int i = 2; i < n; i++) 
		{
			isprime[i] = true;
		}

		for(int i = 2; i < n; i++)
		{
			if(isprime[i] == false)
			{
				continue;
			}
			else
			{
				primesArr.add(i);
				int j = 2;
				int temp = i*j;
				while(temp < n)
				{
					isprime[temp] = false;
					j++;
					temp = i*j;
				}
			}
		}

		for(Integer iter: primesArr)
		{
			System.out.println(iter);
		}
	}
}