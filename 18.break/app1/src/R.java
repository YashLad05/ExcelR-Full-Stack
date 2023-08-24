class R 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
		System.out.println("loop begin (i value) " + i);
		if (i > 5)
			{
				break; // break is a keyword
				// it is not going to skip to next statement
				// break - terminate the entire loop
			}
			System.out.println("loop end (i value) " + i);
		}
		System.out.println("main end");
	}
}
