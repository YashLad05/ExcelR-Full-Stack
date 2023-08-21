class H
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 0) || (i++ == 1))
		// true || true
		// Result > true
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);

	}
}
// || Operator > Logical OR Operator