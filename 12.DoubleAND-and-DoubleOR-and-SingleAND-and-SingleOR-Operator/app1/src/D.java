class D
{
	public static void main(String[] args) 
	{
		int i = 0; // 0
		if((i++ == 1) && (i++ ==1))
		// (0 == 1)   && (1 == 1)
		// Result > false 
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);

	}
}