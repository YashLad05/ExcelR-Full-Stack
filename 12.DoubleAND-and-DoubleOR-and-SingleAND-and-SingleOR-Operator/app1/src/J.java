class J
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((++i == 1) || (i++ == 2))
		// true || false
		// no need to check 2nd expression
		// Result > false
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i); // 2

	}
}
// || Operator > Logical OR Operator