class C
{
	public static void main(String[] args) 
	{
		int i = 0; // 0
		if((i++ == 0) && (i++ ==1))
		// (0 == 0)   && (1 == 1)
		// Result > true AND true = true
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);

	}
}
// && Operator > Logical AND Operator