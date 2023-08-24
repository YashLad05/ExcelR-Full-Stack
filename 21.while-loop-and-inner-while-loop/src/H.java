class H
{
	public static void main(String[] args) 
	{
		System.out.println("While Loop");
		
		int i = 0;
		while((i=2) < 5)
			{
			System.out.println("i value is " + i);
			i--;
			}
	}
}
// will Go for infinite loop
// i is always reassigned 2, which is always true in while loop