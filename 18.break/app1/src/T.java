class T
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 2; i++)
		{
		System.out.println("loop1 begin");
		for(int j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin");
				if (j > 2)
					{
						break; // break - terminate the entire loop
					}
					System.out.println("loop2 end");
			}
			System.out.println("loop1 end");
		}
		System.out.println("main end");
	}
}
/* Output:
i = 0, 1, 2
j = 0, 1, 2, 3

loop1 begin
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop1 end
loop1 begin
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop2 end
loop2 begin
loop1 end
main end
*/
