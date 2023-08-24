class Q 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("loop begin");
			if(i > 5)
			{
				continue; // keyword in JAVA
				// skipping line no. 13 statement 
				// for i = 6, 7, 8, 9
				// iteration no. 7, 8, 9, 10
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
