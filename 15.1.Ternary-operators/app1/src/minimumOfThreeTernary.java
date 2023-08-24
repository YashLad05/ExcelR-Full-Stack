class minimumOfThreeTernary
{
	public static void main(String[] args) 
	{
		// Get minimum of 3 nmbers using if-else
		int i = 100, j = 200, k = 300, min = 0;
		
		int min = ((i < j) && (j < k) ? i : ((j < k) ? j : k));
		if( (i==j) && (j==k) && (k==i) )
		{
			System.out.println("All 3 values are equal");
		}
		else
		{
			System.out.println("Minimum: " + min);
		}

	}
}
