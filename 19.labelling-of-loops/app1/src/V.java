class V
{
	public static void main(String[] args) 
	{
		loop1: // adding label on top of outer loop
		for(int i = 0; i < 2; i++)
		{
		System.out.println("loop1 begin");
		for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin");
				if (j > 2)
					{
						continue loop1; // we are applying 'continue' keyword on outer for loop.
					}
					System.out.println("loop2 end");
			}
			System.out.println("loop1 end");
		}
		System.out.println("main end");
	}
}

/* Output:
i = 0, 1
j = 0, 1, 2, 3

loop1 begin
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop2 end
loop1 begin
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop2 end
main end
*/