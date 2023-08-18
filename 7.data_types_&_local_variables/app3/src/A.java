class A 
{
	public static void main(String[] args) 
	{
		int i;
		int j = i;
		System.out.println(i);
		System.out.println(j);
		// error: variable i might not have been initialized

		// There is no value assigned to i
		// since this, we get error, as no value is supplied to j
	}
}
